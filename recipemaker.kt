fun main(args :Array<String>){

    val Ingrdtns:  List<String> = listOf("1 Agua", "2 Leche", "3 Carne", "4 Verduras", "5 Frutas", "6 cereal", "7 Huevos", "8 Aceite")


    var viewRecipe={x :Int  ->
        val Ingrdtns :  List<String> = listOf("1 Agua", "2 Leche", "3 Carne", "4 Verduras", "5 Frutas", "6 cereal", "7 Huevos", "8 Aceite")
        println("""
            Hacer receta
            Selecciona por categoría el ingrediente que buscas
            1. Agua
            2. Leche
            3. Carne
            4. Verduras
            5. Frutas
            6. Cereal
            7. Huevos
            8. Aceites

        """.trimIndent())

        var op=x
        println("${Ingrdtns.get(op.minus(1))}")


    }


    viewRecipe(7)




