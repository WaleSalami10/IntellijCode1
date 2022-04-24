package org.example

import org.apache.spark.sql.SparkSession

object databrickscalacode1 {
  def main(args:Array[String]): Unit ={
    val spark =SparkSession.builder().appName("Demo").master("local").getOrCreate()
    val df =spark.sql("select current_timestamp")
    df.show()
    spark.stop()
  }

}
