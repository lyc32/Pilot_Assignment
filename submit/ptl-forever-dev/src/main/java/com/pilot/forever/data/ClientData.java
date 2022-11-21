package com.pilot.forever.data;

//TODO:: persistent
public class ClientData {

    public static StringBuilder data;

    static{
        /**
         * Use "/" to delimiter insider client contents
         * Use "&&" to delimiter between clients
         * TODO: persistent with Google dirve spreadsheet
         */
        data = new StringBuilder();
        data.append("Ecommerce/Amazon/client/WA/11&&" +
                "Aviation/American Airlines/client/TX/12&&" +
                "Finance/American Express/client/AZ/15&&" +
                "Technology/Apple/client/TX/11&&" +
                "Telecom/AT&T/client/NJ/15&&" +
                "Telecom/Comcast/client/PA/12&&" +
                "HealthCare/CVS/client/RI/13&&" +
                "Auto/DealerTrack/client/NY/11&&" +
                "Finance/Deutsche Bank/client/NC/12&&" +
                "Finance/Finra/client/MD/13&&" +
                "Auto/Ford/client/MI/11&&" +
                "Real Estate/Freddie Mac/client/VA/12&&" +
                "Finance/Goldman Sachs/client/NY/13&&" +
                "Technology/Google/client/CA/11&&" +
                "Real Estate/Ility/client/NY/11&&" +
                "Ecommerce/JC Penny/client/TX/11&&" +
                "Finance/JPM Chase/client/NY/13&&" +
                "Ecommerce/Krogger/client/CA/12&&" +
                "HealthCare/Liberty Mutual/client/MA/11&&" +
                "Finance/MasterCard/client/NY/11&&" +
                "HealthCare/MetLife/client/NJ,MN/12&&" +
                "Technology/Microsoft/client/WA/12&&" +
                "Technology/Paypal/client/TX/14&&" +
                "Food/PepsiCo/client/TX/11&&" +
                "Finance/PNC Bank/client/MA/12&&" +
                "Telecom/Samsung/client/CA/15&&" +
                "Telecom/Sprint/client/KS WA/12&&" +
                "Telecom/T-Mobile/client/KS NJ/11&&" +
                "Auto/Tesla/client/WA/12&&" +
                "HealthCare/United Health/client/NC/11&&" +
                "HealthCare/USAA/client/TX/11&&" +
                "Finance/Vanguard/client/FL/12&&" +
                "Telecom/Verizon/client/NJ/11&&" +
                "Finance/Visa/client/TX/11&&" +
                "Auto/Volvo/client/CA/12&&" +
                "Ecommerce/Walmart/client/CA/11&&" +
                "Finance/Wells Fargo/client/NC/12&&");
    }

}
