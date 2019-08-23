
val settings: Seq[Def.Setting[String]] = Seq(
  scalaVersion := "2.13.0"
)

lazy val ideaSettings = Def.settings(
  ThisBuild / ideaPluginName := "prismIdeaPlugin",
  ThisBuild / ideaEdition := IdeaEdition.Community,
  ThisBuild / ideaBuild := "191.6183.87",
  ideaInternalPlugins := Seq(),
  ideaExternalPlugins += IdeaPlugin.Id("Scala", "org.intellij.scala", None)
)

lazy val packagingSettings = Def.settings(
  packageMethod := PackagingMethod.Standalone()
)

lazy val prismPlugin: sbt.Project =
  project.in(file("."))
    .settings(settings: _*)
    .settings(ideaSettings: _*)
    .settings(packagingSettings: _*)
    .enablePlugins(SbtIdeaPlugin)

val ideaRunner = createRunnerProject(prismPlugin, "idea-runner")