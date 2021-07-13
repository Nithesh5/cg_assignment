package cg_assignment;

import java.util.Arrays;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class Problem4 {

	public static String checkChristmas(String path) {

		JavaSparkContext sc = null;
		try {
			Logger.getLogger("org").setLevel(Level.ERROR);

			SparkConf sparkConf = new SparkConf().setAppName("Check for the keyword Christmas").setMaster("local[*]");

			sc = new JavaSparkContext(sparkConf);

			JavaRDD<String> linesRdd = sc.textFile(path);

			JavaRDD<String> wordsRdd = linesRdd.flatMap(x -> Arrays.stream(x.split(" ")).iterator());

			JavaRDD<String> filterRdd = wordsRdd.filter(x -> x.contains("Christmas"));

			if (filterRdd.collect().size() > 0) {
				return "Keyword \"Christmas\" exists in the given file";
			} else {
				return "Keyword \"Christmas\" does not exists in the given file";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "Exception Occured";
		} finally {
			sc.close();
		}
	}

	public static void main(String[] args) {
		String path = "C:\\Users\\nithe\\workspace\\JavaPractice\\src\\cg_assignment\\data.txt";
		System.out.println(checkChristmas(path));
	}
}
