val common = Def.settings(
  scalaVersion := "2.13.11-M1",
)
val a1 = project.settings(common)
val a2 = project.settings(common).dependsOn(a1)
