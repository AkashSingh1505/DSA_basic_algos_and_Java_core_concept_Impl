/*
 ,* ,Click ,nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt ,to ,change ,this ,license
 ,* ,Click ,nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java ,to ,edit ,this ,template
 ,*/
package DS_300;

/**
 ,*
 ,* ,@author ,Akash ,singh
 ,*/

    
public class  NewClass {
 
    public static int ceilingInSortedArray(int n ,int x ,int[] arr) {
        int lb=0;
        int ub=n-1;
        while(lb<=ub){
            int mid = lb+(ub-lb)/2;
            if(arr[mid]==x)return arr[mid];
            
            if(x<arr[mid])ub=mid-1;
            if(x>arr[mid])lb=mid+1;
            
        }
        return arr[lb];
    }
    public static void main(String[] args) {
  int arr[]={3,6,9,11,11,13,15,16,17,17,19,29,33,36,37,39,45,51,52,53,57,62,72,76,80,81,84,84,84,89,91,94,94,96,100,105,110,112,113,114,121,121,122,123,126,136,140,141,143,146,148,148,149,151,154,156,158,159,160,163,166,166,172,174,175,181,183,186,189,193,194,195,196,197,198,205,206,206,208,208,209,211,214,217,219,219,225,231,232,233,233,240,240,242,243,246,251,252,253,255,256,266,266,268,268,270,272,274,274,277,279,279,280,280,283,284,284,286,288,289,293,293,297,299,302,306,306,314,319,320,322,322,324,325,326,330,333,334,336,340,346,351,353,354,355,356,357,357,359,362,364,364,367,373,376,378,383,383,391,395,396,398,400,401,404,405,407,409,410,411,411,413,415,418,422,429,432,435,435,436,438,440,441,441,441,444,449,449,452,453,453,458,459,460,460,469,470,474,476,476,477,479,481,484,488,489,492,495,499,504,506,507,513,514,518,519,523,527,533,534,536,537,537,538,538,548,550,553,555,556,557,559,560,560,566,576,576,577,578,579,579,580,583,587,587,587,589,592,594,595,598,605,608,610,611,621,624,629,632,635,640,646,651,653,655,655,661,668,670,671,674,685,685,692,695,698,708,710,713,716,720,725,727,736,737,738,740,741,742,743,747,752,753,758,758,760,761,765,767,770,772,777,777,778,778,779,780,780,781,784,798,799,801,804,804,807,811,813,822,823,825,827,828,832,834,834,837,842,845,850,851,853,855,862,864,867,869,876,877,877,880,883,891,894,898,904,912,912,920,932,942,945,948,948,952,959,959,960,960,960,969,970,970,972,973,977,978,978,983,983,984,994,994,997,1000,1002,1002,1002,1010,1011,1016,1028,1028,1031,1034,1036,1036,1037,1038,1050,1052,1058,1059,1059,1059,1062,1068,1074,1074,1075,1078,1083,1084,1085,1092,1094,1098,1100,1101,1104,1105,1105,1108,1113,1113,1122,1122,1126,1129,1130,1131,1142,1152,1152,1153,1157,1157,1158,1159,1160,1162,1162,1164,1164,1172,1172,1172,1173,1183,1186,1189,1192,1209,1215,1219,1220,1221,1222,1226,1227,1228,1241,1243,1244,1244,1252,1253,1257,1261,1267,1270,1271,1274,1280,1282,1286,1291,1291,1292,1306,1309,1318,1321,1323,1330,1335,1336,1343,1345,1349,1352,1355,1357,1359,1365,1365,1370,1376,1377,1379,1383,1384,1391,1396,1397,1404,1408,1409,1412,1414,1416,1419,1421,1423,1424,1429,1433,1434,1435,1443,1443,1444,1453,1455,1458,1459,1462,1462,1462,1464,1465,1465,1470,1472,1472,1473,1479,1480,1481,1483,1485,1492,1497,1506,1506,1509,1512,1512,1514,1517,1519,1528,1530,1533,1534,1537,1551,1552,1553,1563,1564,1565,1565,1567,1568,1569,1581,1582,1587,1588,1590,1593,1593,1595,1595,1596,1598,1600,1610,1613,1613,1613,1613,1619,1621,1623,1631,1632,1636,1638,1639,1639,1642,1646,1647,1654,1657,1658,1659,1663,1667,1668,1670,1672,1681,1692,1696,1696,1699,1701,1701,1703,1707,1709,1714,1715,1716,1718,1718,1726,1726,1740,1741,1741,1741,1743,1745,1748,1755,1760,1766,1767,1768,1772,1773,1774,1775,1778,1778,1782,1788,1788,1795,1797,1798,1799,1800,1803,1807,1807,1810,1831,1832,1835,1835,1836,1838,1840,1844,1845,1846,1847,1851,1855,1856,1857,1859,1862,1862,1863,1867,1868,1870,1872,1874,1875,1877,1878,1880,1883,1883,1885,1890,1893,1899,1901,1904,1904,1908,1909,1910,1915,1921,1921,1921,1923,1927,1928,1929,1931,1931,1932,1948,1950,1951,1951,1952,1953,1954,1956,1959,1961,1962,1964,1966,1966,1972,1975,1977,1980,1980,1980,1982,1983,1997,1998,1999,2003,2003,2013,2018,2019,2027,2034,2035,2035,2037,2039,2039,2040,2046,2052,2057,2058,2060,2068,2069,2070,2070,2072,2078,2079,2080,2082,2082,2086,2092,2094,2094,2095,2102,2103,2104,2117,2118,2118,2126,2136,2137,2140,2142,2142,2143,2146,2148,2154,2157,2157,2161,2163,2165,2166,2172,2172,2172,2182,2183,2187,2191,2195,2196,2197,2199,2200,2201,2204,2208,2211,2217,2219,2221,2224,2225,2231,2232,2235,2238,2239,2241,2241,2243,2244,2248,2249,2250,2251,2251,2252,2256,2263,2274,2274,2283,2292,2294,2303,2303,2307,2318,2318,2319,2320,2322,2332,2336,2336,2343,2344,2345,2347,2350,2353,2355,2360,2363,2371,2372,2373,2373,2375,2376,2378,2378,2380,2380,2388,2393,2394,2395,2397,2402,2404,2404,2405,2413,2416,2417,2417,2419,2419,2422,2422,2423,2423,2424,2427,2431,2433,2438,2448,2451,2453,2456,2462,2466,2474,2481,2481,2489,2490,2493,2495,2496,2499,2501,2501,2502,2510,2510,2511,2511,2513,2515,2516,2517,2522,2524,2528,2529,2532,2534,2534,2540,2541,2547,2552,2558,2562,2563,2565,2566,2567,2569,2570,2571,2581,2581,2582,2583,2584,2589,2589,2589,2589,2596,2596,2605,2605,2605,2607,2612,2613,2620,2624,2631,2631,2631,2635,2635,2642,2645,2650,2650,2654,2654,2655,2660,2664,2666,2667,2669,2670,2677,2680,2688,2690,2695,2696,2699,2703,2710,2710,2710,2714,2714,2725,2726,2727,2735,2737,2743,2747,2749,2750,2750,2751,2752,2755,2758,2762,2765,2770,2774,2776,2779,2780,2786,2786,2791,2807,2809,2813,2813,2815,2816,2824,2824,2825,2826,2826,2833,2842,2843,2843,2844,2846,2848,2850,2850,2854,2860,2861,2866,2868,2868,2872,2874,2882,2886,2886,2889,2889,2890,2893,2897,2898,2902,2903,2904,2905,2907,2914,2915,2918,2923,2926,2927,2928,2935,2937,2938,2941,2942,2946,2948,2964,2968,2969,2971,2974,2975,2983,2989,2990,2992,2995,3000,3000,3001,3003,3004,3006,3009,3011,3018,3023,3028,3029,3033,3039,3041,3043,3057,3062,3065,3070,3073,3075,3077,3080,3084,3084,3086,3091,3092,3099,3103,3103,3104,3107,3108,3116,3120,3121,3122,3125,3126,3133,3135,3136,3140,3143,3143,3144,3145,3145,3151,3155,3157,3158,3160,3161,3163,3163,3163,3167,3167,3169,3172,3175,3180,3184,3184,3185,3189,3191,3198,3211,3223,3224,3226,3228,3229,3230,3237,3247,3249,3250,3251,3251,3255,3255,3256,3258,3260,3263,3264,3266,3266,3269,3270,3270,3275,3282,3284,3285,3287,3290,3291,3293,3297,3298,3298,3302,3308,3310,3311,3312,3322,3323,3324,3330,3331,3332,3333,3333,3335,3337,3339,3339,3346,3355,3359,3360,3370,3370,3378,3378,3378,3379,3380,3381,3386,3387,3390,3392,3394,3396,3397,3399,3401,3407,3413,3413,3415,3416,3416,3418,3420,3421,3422,3430,3430,3433,3438,3438,3442,3449,3452,3454,3454,3454,3455,3456,3459,3459,3462,3465,3466,3468,3469,3476,3478,3481,3481,3483,3484,3484,3487,3487,3490,3490,3495,3495,3496,3507,3509,3516,3516,3518,3519,3527,3528,3534,3535,3536,3543,3544,3546,3549,3550,3553,3557,3563,3568,3576,3577,3580,3588,3588,3589,3596,3599,3599,3602,3604,3608,3609,3610,3613,3615,3627,3632,3635,3638,3644,3648,3649,3651,3653,3656,3656,3658,3661,3662,3664,3666,3672,3675,3675,3676,3677,3679,3682,3684,3686,3690,3695,3702,3706,3706,3711,3712,3714,3719,3719,3720,3724,3725,3735,3739,3747,3748,3748,3752,3755,3756,3758,3758,3759,3763,3763,3765,3769,3771,3774,3778,3784,3790,3791,3793,3801,3803,3804,3804,3807,3811,3811,3813,3816,3817,3818,3827,3829,3830,3832,3842,3846,3847,3848,3866,3867,3869,3869,3870,3870,3878,3883,3892,3898,3899,3903,3904,3907,3912,3916,3919,3923,3924,3932,3933,3933,3934,3935,3938,3940,3940,3944,3945,3946,3947,3950,3951,3955,3958,3959,3959,3965,3965,3965,3966,3968,3970,3973,3974,3976,3977,3978,3982,3984,3990,3991,3995,3996,3998,3999,3999,4002,4008,4009,4011,4012,4021,4022,4024,4024,4029,4034,4037,4038,4041,4046,4048,4052,4054,4056,4061,4069,4073,4074,4082,4087,4092,4099,4102,4106,4106,4107,4108,4113,4116,4127,4127,4128,4129,4130,4131,4132,4133,4136,4142,4146,4151,4153,4157,4162,4166,4167,4168,4171,4172,4173,4176,4178,4179,4181,4182,4187,4188,4199,4205,4206,4208,4211,4213,4213,4222,4222,4223,4227,4228,4229,4229,4230,4233,4238,4245,4245,4248,4251,4253,4258,4261,4261,4263,4268,4275,4278,4283,4285,4286,4290,4290,4294,4295,4297,4299,4299,4302,4310,4310,4313,4315,4316,4317,4320,4322,4323,4325,4326,4327,4328,4331,4333,4335,4335,4338,4340,4343,4344,4346,4347,4350,4353,4359,4361,4367,4368,4371,4382,4383,4384,4384,4390,4394,4396,4396,4396,4400,4402,4402,4404,4407,4409,4414,4416,4418,4423,4430,4433,4434,4435,4437,4437,4440,4442,4443,4443,4445,4446,4450,4459,4459,4460,4461,4462,4464,4465,4468,4472,4478,4480,4484,4485,4487,4491,4491,4497,4502,4509,4510,4511,4513,4513,4513,4519,4519,4520,4521,4521,4525,4526,4529,4531,4532,4534,4535,4536,4539,4542,4542,4542,4544,4549,4549,4550,4554,4554,4560,4561,4566,4568,4569,4577,4578,4578,4578,4580,4580,4581,4586,4586,4587,4588,4590,4591,4597,4599,4602,4603,4607,4608,4608,4617,4622,4624,4628,4630,4631,4633,4636,4643,4645,4653,4654,4654,4658,4658,4660,4675,4677,4677,4679,4681,4686,4691,4692,4694,4694,4701,4701,4702,4703,4706,4709,4715,4718,4724,4724,4726,4728,4728,4732,4733,4739,4742,4742,4749,4750,4755,4756,4756,4761,4765,4767,4769,4769,4770,4779,4779,4793,4795,4796,4796,4797,4802,4803,4804,4811,4817,4818,4820,4820,4823,4824,4826,4829,4830,4831,4840,4844,4848,4851,4851,4852,4853,4854,4858,4863,4863,4865,4872,4873,4873,4874,4877,4878,4879,4881,4884,4899,4900,4902,4903,4908,4910,4918,4922,4924,4941,4945,4949,4950,4950,4952,4953,4954,4954,4955,4964,4967,4970,4973,4977,4979,4986,4987,4990,4990,4993,4994,4995,4997,4999};
        System.out.println(ceilingInSortedArray(arr.length,3794,arr)); 

    }
}