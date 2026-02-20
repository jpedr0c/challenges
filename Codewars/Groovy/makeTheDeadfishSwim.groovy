//Create a parser to interpret and execute the Deadfish language.
//
//        Deadfish operates on a single value in memory, which is initially set to 0.
//
//        It uses four single-character commands:
//
//i: Increment the value
//d: Decrement the value
//s: Square the value
//o: Output the value to a result array
//All other instructions are no-ops and have no effect.
//
//        Examples
//Program "iiisdoso" should return numbers [8, 64].
//        Program "iiisdosodddddiso" should return numbers [8, 64, 3600].

class DeadFish {
    static def parse (String dateString) {
        int value = 0;
        List<Integer> result = [];

        dateString.each {c ->
            switch (c){
                case "i":
                    value++;
                    break;
                case "d":
                    value--;
                    break;
                case "s":
                    value *= value;
                    break;
                case "o":
                    result << value;
                    break;
                default:
                    println("Caracter inválido. Aceitos somente: i - d - s - o");
            }
        }
        return result;
    }
}
