package com.pilot.forever.data;

import java.util.HashMap;
import java.util.Map;

public class OfferData {

    public static Map<Integer, String> program;
    public static StringBuilder offers;

    static{
        program = new HashMap<>();
        program.put(1, "Fulltime Internship");
        program.put(2, "Crack Interview");
        program.put(3, "Backend Consultancy");
        program.put(4, "Fullstack Consultancy");
        program.put(5, "Code Camp");

        //USE ; && \n as delimiter
        offers = new StringBuilder();
        offers.append("Y. Du;Finra;07-05-2019;2;MD\n" +
                "Y. Du;Apple;03-01-2019;2;TX\n" +
                "K. L. Luo;Walmart;05-01-2019;2;CA\n" +
                "M. Z. Xu;Goldman Sachs;06-01-2019;2;NY\n" +
                "M. Z. Xu;United Health;11-01-2019;2;MN\n" +
                "Z. Wang;T-Mobile;01-01-2019;2;KS\n" +
                "R. Z. Lei;AT&T;11-01-2018;2;NJ\n" +
                "J. H. Zhang;Walmart;07-01-2019;2;CA\n" +
                "J. H. Zhang;Walmart;08-01-2019;2;AR\n" +
                "L. T. Jiang;Krogger;02-01-2019;2;CA\n" +
                "Y. Shen;MetLife;04-01-2019;2;NJ\n" +
                "X. Ma;Sprint;12-01-2019;2;KS\n" +
                "Y. Li;PNC Bank;05-01-2019;2;MA\n" +
                "S. Chen;JPM Chase;12-01-2018;2;NY\n" +
                "Y. Wu;Ility;04-01-2019;2;NY\n" +
                "B. B. Li;Volvo;11-01-2018;2;CA\n" +
                "Z. Zhang;Walmart;02-01-2019;2;CA\n" +
                "J. Shi;Walmart;02-01-2019;2;CA\n" +
                "R. Li;AT&T;11-01-2018;2;NJ\n" +
                "R. Li;Volvo;10-01-2018;2;CA\n" +
                "J. C. Ma;Finra;04-05-2019;2;MD\n" +
                "X. N. Chen;United Health;03-05-2019;2;NC\n" +
                "X. N. Chen;Verizon;10-05-2019;2;NJ\n" +
                "T. Sun;Krogger;02-01-2019;2;CA\n" +
                "J. Y. Duan;MasterCard;03-01-2019;2;NY\n" +
                "J. Y. Duan;Visa;02-01-2020;2;TX\n" +
                "B. Lin;T-Mobile;06-01-2019;2;WA\n" +
                "Z. Wang;T-Mobile;06-01-2019;2;WA\n" +
                "Q. Tang;JC Penny;06-01-2020;2;TX\n" +
                "E. Y. Su;Walmart;03-01-2019;2;AR\n" +
                "P. Yao;Walmart;03-01-2019;2;AR\n" +
                "G. F. Xu;Walmart;03-01-2019;2;AR\n" +
                "Q. Wan;USAA;01-01-2020;2;TX\n" +
                "Q. Wan;Tesla;06-01-2019;2;WA\n" +
                "H. Zhang;Liberty Mutual;05-01-2019;2;MA\n" +
                "H. Liu;Samsung;10-01-2019;2;CA\n" +
                "H. Liu;Walmart;06-01-2019;2;AR\n" +
                "S. X. Wan;American Express;10-01-2019;2;AZ\n" +
                "S. S. Fang;Paypal;03-01-2019;2;TX\n" +
                "Z. Zhang;Finra;10-01-2019;2;MD\n" +
                "A. Y. Wu;Microsoft;12-01-2019;2;WA\n" +
                "Y. Mo;Vanguard;10-01-2019;2;FL\n" +
                "D. Y. Li;Freddie Mac;02-01-2020;2;VA\n" +
                "D. Qiu;American Airlines;03-01-2020;2;TX\n" +
                "X. Jin;Wells Fargo;03-01-2020;2;NC\n" +
                "Y. Hu;Apple;04-01-2020;2;CA\n" +
                "C. Y. Shi;Deutsche Bank;05-01-2020;2;NC\n" +
                "H. Jiang;Paypal;05-01-2020;2;CA\n" +
                "H. Jiang;Google;02-01-2020;2;CA\n" +
                "H. Jiang;Fresenius;05-01-2020;2;MA\n" +
                "J. Z. Cao;Apple;04-01-2020;3;CA\n" +
                "J. K. Liu;Paypal;08-01-2020;3;CA\n" +
                "Z. Liu;Walmart;04-01-2020;2;CA\n" +
                "L. Zhang;Walmart;04-01-2020;2;CA\n" +
                "M. Ye;Comcast;06-01-2020;2;PA\n" +
                "X. Zhang;Ford;08-01-2020;2;MI\n" +
                "Y. Shang;CVS;03-01-2019;2;RI\n" +
                "Y. Shang;Herbalife Nutrition;03-01-2019;2;NY\n" +
                "D. An;PepsiCo;03-01-2018;2;TX\n" +
                "X. Tang;Verizon;03-01-2018;5;FL\n" +
                "Y. Li;Amazon;03-01-2018;5;WA\n" +
                "Z. Li;DealerTrack;03-01-2020;5;NY\n" +
                "L. T. Xue;Ford;09-05-2020;2;MI\n" +
                "G. W. Zhu;Walmart;09-20-2020;2;CA\n" +
                "K. Y. Liu;Paypal;09-27-2020;3;CA\n" +
                "A. An;Paypal;10-19-2020;3;CA\n" +
                "K. S. Yin;Paypal;10-22-2020;3;CA\n" +
                "S. S. Fang;Paypal;01-18-2021;2;TX\n" +
                "X. E. Jin;Paypal;01-18-2021;2;CA\n" +
                "X. E. Jin;ATT;01-18-2021;2;NJ\n" +
                "Z. A. Gong;IDT Tech;01-31-2021;2;VA\n" +
                "Z. Q. Ai;Samsung;01-18-2021;2;CA\n" +
                "H. T. Yang;Infosys;02-03-2021;3;CA\n" +
                "J. J. Lian;Volvo;02-03-2021;3;CA\n" +
                "L. G. Zhang;Paypal;02-10-2021;3;CA\n" +
                "J. Z. Li;Paypal;02-20-2021;3;CA\n" +
                "E. Z. Wang;Paypal;02-26-2021;3;CA\n" +
                "E. Z. Wang;Walmart;02-26-2021;3;AR\n" +
                "J. Z. Du;Walmart;02-26-2021;3;AR\n" +
                "J. Z. Li;eBay;03-15-2021;3;NY\n" +
                "E. B. Jiang;Walmart;03-15-2021;3;CA\n" +
                "J. J. He;Paypal;03-20-2021;3;CA\n" +
                "L. T. Xue;LG;03-10-2021;2;NJ\n" +
                "E. B. Jiang;Airbnb;05-03-2021;3;CA\n" +
                "W. J. Zhao;ATT;05-15-2021;3;NJ\n" +
                "Richard Lyu;ebay;07-01-2021;3;WA\n" +
                "W. J. Zhao;ATT;05-15-2021;3;NJ\n" +
                "Rex Du;Airbnb;09-15-2021;3;CA\n" +
                "George Zhu;Walmart;07-02-2021;3;TX\n" +
                "John Du;Walmart;11-15-2021;3;CA\n" +
                "Richard Li;Walmart;07-15-2021;3;CA\n" +
                "Cassie Liu;Paypal;08-15-2021;3;CA\n" +
                "Jill Lian;Apple;07-18-2021;3;CA\n" +
                "Jason Peng;CWT;11-15-2021;3;CT\n" +
                "Kelly Wang;Walmart;01-18-2022;3;CA\n" +
                "Victor Zhang;ATT;09-14-2021;3;NJ\n" +
                "Victor Zhang;Chase;09-19-2021;3;NY\n" +
                "Jason Zhang;Paypal;09-25-2021;3;CA\n" +
                "Jacky Cheng;Walmart;10-15-2021;3;AR\n" +
                "Jacky Cheng;CWT;10-16-2021;3;CT\n" +
                "Pola Lyu;Walmart;09-17-2021;3;AR\n" +
                "Martin Weng;CVS;09-19-2021;3;RI\n" +
                "Martin Weng;CWT;09-21-2021;3;CT\n" +
                "Jingjing Liu;CVS;10-15-2021;3;RI\n" +
                "Shawn Yin;Walmart;10-17-2021;3;CA\n" +
                "Chelsie Wang;Walmart;12-17-2021;3;NJ\n" +
                "Carter Du;CWT;12-21-2021;3;CT\n" +
                "Chris Zhou;Paypal;12-25-2021;3;CA\n" +
                "Edward Yin;Paypal;12-28-2021;3;CA\n" +
                "Sophie Ni;Walmart;01-05-2022;3;CA\n" +
                "Jack Yang;Walmart;01-08-2022;3;CA\n" +
                "Stephine Wang;Walmart;01-09-2022;3;CA\n" +
                "Rex Du;Paypal;01-24-2022;3;CA\n" +
                "Rex Du;Airbnb;01-28-2022;3;CA\n" +
                "Hawke Yang;Chase;10-28-2021;2;TX\n" +
                "Nathan Chen;Walmart;02-05-2022;3;CA\n" +
                "Joe Sun;Walmart;02-06-2022;3;CA\n" +
                "Caroline Ma;Walmart;02-12-2022;3;CA\n" +
                "Alvin Zhang;Walmart;02-14-2022;3;CA\n" +
                "Amy Gu;Walmart;02-16-2022;3;CA\n" +
                "William Guo;Walmart;03-06-2022;3;CA\n" +
                "Alvin Yao;Walmart;03-08-2022;3;CA\n" +
                "Alma Zeng;Walmart;03-16-2022;3;CA\n" +
                "Peter Yang;Walmart;03-20-2022;3;NJ\n" +
                "Sam Yan;Walmart;04-06-2022;3;CA\n" +
                "Abby Zhang;Walmart;04-08-2022;3;CA\n" +
                "Fred Du;Walmart;04-09-2022;3;CA\n" +
                "Jack Zou;Walmart;04-16-2022;3;CA\n" +
                "Michelle He;Google;05-01-2022;3;CA\n" +
                "Alex Li;Walmart;05-06-2022;3;CA\n" +
                "Mark Peng;Walmart;05-08-2022;3;CA\n" +
                "Mark Peng;Paypal;05-16-2022;3;TX\n" +
                "Ryan Zhang;Walmart;05-18-2022;3;VA\n" +
                "Eason Jiang;CWT;04-05-2022;3;CT\n" +
                "Alyssa Zhang;Paypal;05-22-2022;3;CA\n" +
                "Ray Lei;Walmart;05-27-2022;3;CA\n" +
                "Jason Gong;Walmart;05-29-2022;3;CA\n" +
                "Jason Gong;T-Mobile;06-05-2022;3;WA\n" +
                "Alvin Zhang;CVS;06-20-2022;3;RI\n" +
                "Kayn Zhai;CVS;06-20-2022;3;RI\n" +
                "Danny Luo;CVS;06-20-2022;3;RI\n" +
                "Alvin Zhang;CVS;06-20-2022;3;RI\n" +
                "David Liu;Walmart;06-30-2022;3;AR\n" +
                "Stier Chen;Walmart;06-30-2022;3;CA\n" +
                "Shirley Cheng;Bayer Pharmaceuticals;07-15-2022;3;NJ\n" +
                "Jammy Ba;Walmart;07-25-2022;3;VA\n" +
                "Jammy Ba;Paypal;07-28-2022;3;CA\n" +
                "Alex Ou;Walmart;07-31-2022;3;CA\n" +
                "Lily Su;Walmart;08-05-2022;3;CA\n" +
                "Ace Zhang;T-Mobile;08-28-2022;3;WA\n" +
                "Charlotte Li;OnDot;09-01-2022;3;CA\n" +
                "Jackson Guo;Walmart;09-08-2022;3;CA\n" +
                "Tracy Liang;Walmart;09-10-2022;3;CA\n" +
                "Frank Shang;MasterCard;09-11-2022;3;MO\n" +
                "Edward Yin;Visa;09-11-2022;3;CA\n" +
                "Edward Yin;Paypal;09-12-2022;3;CA\n" +
                "Jacky Cheng;CWT;09-12-2022;3;CT\n" +
                "Selina Gao;T-Mobile;09-13-2022;3;WA\n" +
                "Selina Gao;Walmart;09-13-2022;3;NJ\n" +
                "Jessica Sang;Worldwide Express;09-14-2022;3;TX\n" +
                "Alexis Tang;Walmart;09-15-2022;3;CA\n" +
                "Eric Zhang;Walmart;09-16-2022;3;CA\n"
        );
    }
}
