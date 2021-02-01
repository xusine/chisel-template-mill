import mill._, scalalib._

/**
 * All chisel modules should extends this trait where the chisel dependency is included.
 */ 
trait ChiselModule extends ScalaModule {
  def scalaVersion = "2.12.12"

  def ivyDeps = Agg(
    ivy"edu.berkeley.cs::chisel3:3.4.1",
  )

  def scalacOptions = Seq(
    "-Xsource:2.11",
    "-language:reflectiveCalls",
    "-deprecation",
    "-feature",
    "-Xcheckinit"
  )

  def scalacPluginIvyDeps = Agg(
    ivy"edu.berkeley.cs:::chisel3-plugin:3.4.1",
    ivy"org.scalamacros:::paradise:2.1.1"
  )

  object test extends Tests {
    def ivyDeps = Agg(
      ivy"edu.berkeley.cs::chiseltest:0.3.1"
    )
    def testFrameworks = Seq("org.scalatest.tools.Framework")
  }
}


object GCD extends ChiselModule {
  
}
