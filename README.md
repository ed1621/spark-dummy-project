# Spark dummy problems

This is a template project for some general problems to solve with spark.

### Dependencies

- Scala 2.15 
- Sbt
- Python3 to run the data generation

You can run the data generator by running `python3 ./generator.py` in the command line.

You'll want to run the generator script sooner, rather than later as it takes a long time to fully generate the data. After it's done, you should have 3 csv files - `sellers.csv`, `sales.csv`, and `products.csv`

Based off of [this blog post](https://towardsdatascience.com/six-spark-exercises-to-rule-them-all-242445b24565)

The `Main.scala` file already has spark initiated and has a couple of the problems for from the blogpost. If you wanna see the other questions, either go to the blog post (pretty good read overall) or you can checkout [problems.md](./problems.md)
