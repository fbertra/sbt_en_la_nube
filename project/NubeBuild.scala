/*
 * mientras el formato ".sbt" no soporte multi-proyecto, mejor usar ".scala"
 */

package nube

import sbt._
import sbt.Process._
import sbt.Keys._


/*
 *
 */
 
object BuildSettings {
  val buildSettings = Defaults.defaultSettings ++ Seq(
    organization := "cl.fbd",
    version      := "1.0",
    scalaVersion := "2.10.0",  // "2.9.1" 
    resolvers    := Seq (Resolvers.typesafe)
  )
}

/*
 *
 */

object Resolvers {
  val typesafe    = "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"
}

/*
 *
 */

object Dependencies {
}

/*
 *
 */

object NubeBuild extends Build {
  import Resolvers._
  import BuildSettings._
  import Dependencies._

  // un solo proyecto por el momento
  lazy val all = Project (
    id = "all",
    base = file (".")
  ) aggregate (main)
  
  // proyecto
  lazy val main = Project(
    id = "sbt_nube-main",
    base = file("sbt_nube-main")
    )    
}
