import mill._, scalalib._

/**
 * All chisel modules should extends this trait where the chisel dependency is included.
 */ 
trait ChiselModule extends ScalaModule {
  def scalaVersion = "2.13.7"

  override def ivyDeps = Agg(
    ivy"edu.berkeley.cs::chisel3:3.5.0"
  )

  override def scalacOptions = Seq(
    "-language:reflectiveCalls",
    "-deprecation",
    "-feature",
    "-Xcheckinit",
    "-P:chiselplugin:useBundlePlugin"
  )

  override def scalacPluginIvyDeps = Agg(
    ivy"edu.berkeley.cs:::chisel3-plugin:3.5.0",
  )

  object test extends Tests {
    override def ivyDeps = Agg(
      ivy"edu.berkeley.cs::chiseltest:0.5.0-RC2"
    )
    def testFramework = "org.scalatest.tools.Framework"
  }
}


object GCD extends ChiselModule {
  
}
