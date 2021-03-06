package com.google.cloud.bigquery.samples.test;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.cloud.bigquery.samples.LoadDataCsvSample;

import org.junit.Test;

import java.io.*;

/**
 * TODO: Insert description here. (generated by elibixby)
 */
public class LoadDataCsvSampleTest extends BigquerySampleTest {

  /**
   * @throws JsonSyntaxException
   * @throws JsonIOException
   * @throws FileNotFoundException
   */
  public LoadDataCsvSampleTest() throws JsonSyntaxException, JsonIOException, FileNotFoundException {
    // TODO(elibixby): Auto-generated constructor stub
    super();
  }

  @Test
  public void testLoadData() throws IOException, InterruptedException{

      InputStreamReader is = new InputStreamReader(LoadDataCsvSample
              .class.getResourceAsStream("/schema.json"));
    LoadDataCsvSample.run(
        CONSTANTS.getCloudStorageInputURI(),
        CONSTANTS.getProjectId(),
        CONSTANTS.getDatasetId(),
        CONSTANTS.getNewTableId(),
          is ,
        5000L);
  }


}
