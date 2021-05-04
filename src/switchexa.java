class switchexa
{
    public static void main(String[] args)
    {
        int num= 8;
        String month="";
        switch (num)
        {
            case 1: month="1-Jan";
            break;

            case 2: month="2-Feb";
            break;

            case 3: month="3-Mar";
            break;

            case 4: month="4-Apr";
            break;

            case 5: month="5-May";
            break;

            case 6: month="6-Jun";
            break;

            case 7: month="7-Jul";
            break;

            case 8: month="8-Aug";
            break;

            case 9: month="9-Sep";
            break;

            case 10: month="10-Oct";
            break;

            case 11: month="11-Nov";
            break;

            case 12: month="12-Dec";
            break;

            default:System.out.println("Invalid number");

        }
        System.out.println(month);
    }
}