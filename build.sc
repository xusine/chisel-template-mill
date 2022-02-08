import mill._, scalalib._

/**
 * All chisel modules should extends this trait where the chisel dependency is included.
 */ 
trait ChiselModule extends ScalaModule {
  def scalaVersion = "2.13.8"

  override def ivyDeps = Agg(
    ivy"edu.berkeley.cs::chisel3:3.5.1"
  )

  override def scalacOptions = Seq(
    "-language:reflectiveCalls",
    "-deprecation",
    "-feature",
    "-Xcheckinit",
  )

  override def scalacPluginIvyDeps = Agg(
    ivy"edu.berkeley.cs:::chisel3-plugin:3.5.1",
  )

  object test extends Tests {
    override def ivyDeps = Agg(
      ivy"edu.berkeley.cs::chiseltest:0.5.1"
    )
    def testFramework = "org.scalatest.tools.Framework"
  }
}


object GCD extends ChiselModule {
  
}
