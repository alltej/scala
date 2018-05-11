name := "learning-scala"

version := "0.1"

scalaVersion := "2.11.8"
resolvers  += "MavenRepository" at "http://central.maven.org/maven2"

libraryDependencies ++= {
  val sparkVersion = "2.2.1"
  Seq( "org.apache.spark" %% "spark-core" % sparkVersion)
}

