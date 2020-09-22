name := "gitbucket-branch-protect-plugin"

organization := "com.github.tohosokawa"

version := "1.1.0"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "io.github.gitbucket" %% "gitbucket"         % "4.32.0" % "provided",
  "javax.servlet"        % "javax.servlet-api" % "3.1.0"  % "provided"
)

resolvers += Resolver.bintrayRepo("bkromhout", "maven")
