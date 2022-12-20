import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object Main extends App {
/*
Find out how many orders, how many products and how many sellers are in the data.
How many products have been sold at least once? Which is the product contained in more orders?
 */

  val spark = SparkSession.builder()
    .master("local")
    .config("spark.sql.autoBroadcastJoinThreshold", -1)
    .config("spark.executor.memory", "500mb")
    .appName("Exercises")
    .getOrCreate()


}
