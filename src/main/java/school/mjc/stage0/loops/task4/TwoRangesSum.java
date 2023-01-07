package school.mjc.stage0.loops.task4;

public class TwoRangesSum {

    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int counterSkipNumber = 0;
        int counterLiR = 0;
        int counter = numberToSkip;
        if(numberToSkip > lastInRow){
            System.out.println("number to skip is bugger then the last");
        }else if(lastInRow < 0){
            System.out.println("last number in row is negative");
        }else if (numberToSkip <= lastInRow){
            for(int i = 0; i <= numberToSkip; i++){
                counterSkipNumber = counterSkipNumber + i;
                }
            for(int f = numberToSkip; f < lastInRow; f++){
                counter++;
                counterLiR = counterLiR + counter;
            }

            }
            System.out.println("skipped sum is" + counterSkipNumber);
            System.out.println("counted sum is" + counterLiR);
        }

    }
