//importing libraries
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._


//creating an entry point of this script

object loaddataset extends App {

    //creating a sparksession
    val spark = SparkSession.builder().appName("loaddataset").master("local[*]").getOrCreate()

    //reading in the data without explicitly defining the schema
    //dataset is not too big, so no sampling ratio is required

    val df = spark.read
                    .format("com.crealytics.spark.excel")
                    .option("header",true)
                    .option("inferschema",true)
                    .load("data/googlestore.xlsx")

    df.show()

spark.stop()
}