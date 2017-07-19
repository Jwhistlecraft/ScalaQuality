object NumExercise extends App {

  def bigNum(bNum: Long): String = {
    val numStr = bNum.toString.reverse

    val ZERO = 0
    val THREE = 3
    val SIX = 6
    val NINE = 9
    val TWELVE = 12
    val FIFTEEN = 15
    val EIGHTEEN = 18
    val TWENTYONE = 21

    bNum match {

      case a if numStr.length > THREE & numStr.length <= SIX =>
          val thou = (numStr.substring (ZERO, THREE) + " dnasuoht " + numStr.substring (THREE, numStr.length) ).reverse

        val thouF = thou.replace ("thousand", "mille")
          "English: " + thou + ", French: " + thouF


      case b if numStr.length > SIX & numStr.length <= NINE =>
          val mill = (numStr.substring (ZERO, THREE) + " dnasuoht " + numStr.substring (THREE, SIX) + " noillim " +
          numStr.substring (SIX, numStr.length) ).reverse

        val millF = mill.replace ("thousand", "mille")
          "English: " + mill + ", French: " + millF


      case c if numStr.length > NINE & numStr.length <= TWELVE =>
          val bill = (numStr.substring (ZERO, THREE) + " dnasuoht " + numStr.substring (THREE, SIX) + " noillim " +
          numStr.substring (SIX, NINE) + " noillib " + numStr.substring (NINE, numStr.length) ).reverse

          val billF = bill.replace ("thousand", "mille").replace ("billion", "milliard")
          "English: " + bill + ", French: " + billF


      case d if numStr.length > TWELVE & numStr.length <= FIFTEEN =>
          val trill = (numStr.substring (ZERO, THREE) + " dnasuoht " + numStr.substring (THREE, SIX) + " noillim " +
          numStr.substring (SIX, NINE) + " noillib " + numStr.substring (NINE, TWELVE
          ) + " noillirt " + numStr.substring (TWELVE, numStr.length) ).reverse

          val trillF = trill.replace ("thousand", "mille").replace ("billion", "milliard")
          .replace ("trillion", "billion")
          "English: " + trill + ", French: " + trillF


      case e if numStr.length > FIFTEEN & numStr.length <= EIGHTEEN =>
          val quad = (numStr.substring (ZERO, THREE) + " dnasuoht " + numStr.substring (THREE, SIX) + " noillim " +
          numStr.substring (SIX, NINE) + " noillib " + numStr.substring (NINE, TWELVE) + " noillirt " +
          numStr.substring (TWELVE, FIFTEEN) + " noillirdauq " + numStr.substring (FIFTEEN, numStr.length) ).reverse

          val quadF = quad.replace ("thousand", "mille").replace ("billion", "milliard").replace ("trillion", "billion")
          .replace ("quadrillion", "billiard")
          "English: " + quad + ", French: " + quadF


      case f if numStr.length > EIGHTEEN & numStr.length <= TWENTYONE =>
          val quin = (numStr.substring (ZERO, THREE) + " dnasuoht " + numStr.substring (THREE, SIX) + " noillim " +
          numStr.substring (SIX, NINE) + " noillib " + numStr.substring (NINE, TWELVE) + " noillirt " +
          numStr.substring (TWELVE, FIFTEEN) + " noillirdauq " + numStr.substring(FIFTEEN, EIGHTEEN) + " noillitniuq " +
          numStr.substring (EIGHTEEN, numStr.length) ).reverse

          val quinF = quin.replace ("thousand", "mille").replace ("billion", "milliard").replace ("trillion", "billion")
          .replace ("quadrillion", "billiard").replace ("quintillion", "trillion")
          "English: " + quin + ", French: " + quinF


      case _ => "invalid input"
    }
  }
}