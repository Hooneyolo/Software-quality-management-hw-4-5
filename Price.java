/**
 * 여기에 ABC 클래스 설명을 작성하십시오.
 * 
 * @author (2018315005 유제훈) 
 * @version (2020.05.29)
 */
public class Price
{
    int age; // 변수정의
    public static int ticket(int age, int peo){
        if(age >= 16){
            return peo * 2000;
        }
        if(age < 16 && age >= 7){
            return peo * 900;
        }
        if(age < 7 && age >= 4){
            return peo * 400;
        }
        if(age < 4 && age > 0){
            return peo * 0;
        }
        return age;
    }
}