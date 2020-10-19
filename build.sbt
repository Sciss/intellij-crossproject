lazy val root = crossProject(JVMPlatform, JSPlatform).in(file("."))
  .settings(
    scalaVersion := "2.13.3"
  )
