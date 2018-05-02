
package methods

object RegExp {
  val p = """school=([^,]+),name=([^,]+),code=([^,]+),address=([^,]+),major=([^,]+),grade=(.+)""".r

  def test(text: String) =
    p.findAllIn(text).matchData.map(m =>
      (1 to m.groupCount).map(m.group).toList
    ).toList.headOption.getOrElse(List.empty[String]) 
}
