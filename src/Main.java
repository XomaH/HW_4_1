public class Main {
    public static void main(String[] args){
        int age = 15;
        {
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека " + age + " то оy несовершеннолетний");
            }

        }


        int tempOnStriit = 12;
        {
            if (tempOnStriit >= 5)
            {
                System.out.println("На улице " + tempOnStriit + " градусов, можно идти без шапки");
            }
            else
            {
                System.out.println("На улице " + tempOnStriit + " градусов, нужно надеть шапку");
            }
        }


        int speed = 55;
        {
            if (speed > 60)
            {
                System.out.println("Если скорость " + speed + " то, придется заплатить штраф");
            }
            else
            {
                System.out.println("Если скорость " +speed + " то, можно ездить спокойно ");
            }
        }
        int vozrast  = 28;
        {
            if (vozrast>=2 && vozrast <=6)
            {
                System.out.println("Если возраст равен " + vozrast + " то ему нужно ходить в детский сад");
            }
            else {
                if (vozrast > 6 && vozrast < 17)
                {
                    System.out.println("Если возраст равен " + vozrast + " то ему нужно ходить в Школу");
                } else if (vozrast > 17 && vozrast < 24)
                {
                    System.out.println("Если возраст равен " + vozrast + " то ему нужно ходить  в университет");
                }
                else {
                    System.out.println("Если возраст равен " + vozrast + " то ему нужно ходить на работу");
                }
            }
        }


        int ageChild = 3;
        {
            if (ageChild < 5) {
                System.out.println("Если возраст ребенка " + ageChild + " , то ему нельзя кататься на атракционах");
            } else if (ageChild > 5 && ageChild < 14) {
                System.out.println("Если ребенку " + ageChild + ", то ему можно кататься на атракционах в сопровождении");
            }
            else
            {
                System.out.println("Если ребенку " + ageChild + "то ему можно кататься на атракционах");
            }
        }


        int peopleInVagon = 50;
        int seetPlase = 60;
        int maxPlase = 102;
        int freePlase = maxPlase - peopleInVagon;
        {
            if (peopleInVagon >= maxPlase)
            {
                System.out.println("В вагоне нет свободных мест");
            }
            else if (peopleInVagon >= 60)
            {
                System.out.println("В вагоне свободно " + freePlase + " стоячих мест");
            } else {
                System.out.println("В вагоне есть " + freePlase + " свободных мест, из них " + (seetPlase-peopleInVagon) + " сидячих");

            }
        }
        int one = 1;
        int two = 2;
        int three = 3;

        {
            if (one > two && one > three)
            {
                System.out.println("Число " + one + "самое большое");
            } else if (two > three)
            {
                System.out.println("Число " + two + "самое большое");
            }
            else
            {
                System.out.println("Чмсло " + three + " самое большое");
            }
        }


    }
}




