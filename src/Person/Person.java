package Person;

class Person {
        String StudentName;
        String StudentAddress;
        final String country = " Japan ";

        Person(String paramName, String paramAddress){
                StudentName = paramName;
                StudentAddress = paramAddress;
        }

        Person(String paramName){
                this(paramName,null);
        }

        Person(){
                this(null);
        }

        void calling(String paramName){

                System.out.println(" Hello " + paramName + " my Name is " + StudentName);
        }
}
