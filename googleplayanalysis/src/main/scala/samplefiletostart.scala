import org.apache.spark.sql.functions._
import org.apache.spark.sql.SparkSession

object sample extends App {

    val spark = SparkSession.builder().appName("sample").master("local[*]").getOrCreate()
    println("spark initiated properly")


    spark.stop()
}
