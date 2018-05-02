package com

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import org.openjdk.jmh.annotations.Setup
 
import java.util.concurrent.TimeUnit


object Data {
  val string = "school=1,name=2,code=3,address=4,major=5,grade=6"
}

@OutputTimeUnit(TimeUnit.MILLISECONDS)
@BenchmarkMode(Array(Mode.Throughput))
class TextMatching {

  @Benchmark
  def regexp = methods.RegExp.test(Data.string)

  @Benchmark
  def fastparse = methods.FastParse.test(Data.string)

}

