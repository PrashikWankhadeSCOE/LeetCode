
class Solution {
    public int dayOfYear(String date) {
        //int days = 0;
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int days = Integer.parseInt(date.substring(8));

        //days = day;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            switch (month) {
                case 1:
                    days = days;
                    break;
                case 2:
                    days = days + 31;
                    break;
                case 3:
                    days = days + 31 + 29;
                    break;
                case 4:
                    days = days + 31 + 29 + 31;
                    break;
                case 5:
                    days = days + 31+ 29 + 31 + 30;
                    break;
                case 6:
                    days = days + 31 + 29 + 31 + 30 + 31;
                    break;
                case 7:
                    days = days + 31 + 29 + 31 + 30 + 31 + 30;
                    break;
                case 8:
                    days = days + 31 + 29 + 31 + 30 + 31 + 30 + 31;
                    break;
                case 9:
                    days = days + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
                    break;
                case 10:
                    days = days + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                    break;
                case 11:
                    days = days + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                    break;
                default:
                    days = days + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
            }
        }
        else{
            switch (month) {
                case 1:
                    days = days;
                    break;
                case 2:
                    days = days + 31;
                    break;
                case 3:
                    days = days + 31 + 28;
                    break;
                case 4:
                    days = days + 31 + 28 + 31;
                    break;
                case 5:
                    days = days + 31 + 28 + 31 + 30;
                    break;
                case 6:
                    days = days + 31 + 28 + 31 + 30 + 31;
                    break;
                case 7:
                    days = days + 31 + 28 + 31 + 30 + 31 + 30;
                    break;
                case 8:
                    days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31;
                    break;
                case 9:
                    days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                    break;
                case 10:
                    days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                    break;
                case 11:
                    days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                    break;
                default:
                    days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
            }
        }
        return days;
    }
}
