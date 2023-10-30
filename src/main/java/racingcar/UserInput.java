package racingcar;

import java.util.*;
import java.util.regex.Pattern;

import camp.nextstep.edu.missionutils.Console;

import static org.assertj.core.util.Arrays.asList;

public class UserInput {
    public List<String> inputRacingCarName() {
        String input = Console.readLine();
        String inputArray[] = input.split(",");
        List<String> racingCarName = new ArrayList<>(Arrays.asList(inputArray));
        racingCarNameValidation(racingCarName);
        System.out.println(racingCarName);
        return racingCarName;
    }
    private void racingCarNameValidation(List<String> racingCarName){
        for (int i=0;i<racingCarName.size();i++) {
            String validationName = racingCarName.get(i);
            if (validationName.length()>5||validationName.length()<=0||!Pattern.matches("^[a-zA-Z]*$",validationName)){
                throw new IllegalArgumentException("잘못된 입력");
            }
        }
    }
}
