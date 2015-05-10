package root
import com.adt2.model.ADT2
import com.adt1.model.ADT1
import shapeless.Generic

object BothCompile {
  val gen1 = Generic[ADT1]
  val gen2 = Generic[ADT2]
}
