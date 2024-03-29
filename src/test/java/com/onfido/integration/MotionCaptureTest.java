package com.onfido.integration;

import com.onfido.ApiException;
import com.onfido.model.MotionCapture;
import java.io.File;
import java.nio.file.Files;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotionCaptureTest extends TestBase {

  private static final UUID EXAMPLE_ID_1 =
      UUID.fromString(System.getenv("ONFIDO_SAMPLE_MOTION_ID_1"));

  @Test
  public void downloadMotionCaptureTest() throws Exception {
    File download = onfido.downloadMotionCapture(EXAMPLE_ID_1);

    Assertions.assertTrue(download.length() > 0);
  }

  @Test
  public void downloadMotionCaptureFrameTest() throws Exception {
    try {
      File download = onfido.downloadMotionCaptureFrame(EXAMPLE_ID_1);
      byte[] content = Files.readAllBytes(download.toPath());

      Assertions.assertTrue(download.length() > 0);
      Assertions.assertEquals("JFIF", new String(content, 6, 4));
    } catch (ApiException ex) {
      Assertions.assertEquals(422, ex.getCode());
      Assertions.assertEquals(
          "Failed to extract a frame from the provided motion capture (status code 422)",
          ex.getMessage());
    }
  }

  @Test
  public void downloadErrorTest() throws Exception {
    try {
      onfido.downloadMotionCapture(nonExistingId);
      Assertions.fail();
    } catch (ApiException ex) {
      Assertions.assertEquals(404, ex.getCode());
    }
  }

  @Test
  public void findMotionCaptureTest() throws Exception {
    String expectedFilename = EXAMPLE_ID_1 + ".mp4";

    MotionCapture motionCapture = onfido.findMotionCapture(EXAMPLE_ID_1);

    Assertions.assertEquals(expectedFilename, motionCapture.getFileName());
  }

  @Test
  public void listMotionCapturesTest() throws Exception {
    List<MotionCapture> motionCaptures =
        onfido.listMotionCaptures(sampleApplicantId).getMotionCaptures();

    Assertions.assertEquals(2, motionCaptures.size());
  }
}
