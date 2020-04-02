package au.edu.unsw.infs3634.cryptobag;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CoinService {
    @GET("users/{user}/repos")
    Call<List<CoinLoreResponse>> listRepos(@Path("user") String user);

    public String coinAPI() {
        String coins = "{\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"id\": \"90\",\n" +
                "      \"symbol\": \"BTC\",\n" +
                "      \"name\": \"Bitcoin\",\n" +
                "      \"nameid\": \"bitcoin\",\n" +
                "      \"rank\": 1,\n" +
                "      \"price_usd\": \"6315.22\",\n" +
                "      \"percent_change_24h\": \"-2.64\",\n" +
                "      \"percent_change_1h\": \"0.17\",\n" +
                "      \"percent_change_7d\": \"-5.80\",\n" +
                "      \"price_btc\": \"1.00\",\n" +
                "      \"market_cap_usd\": \"115449618838.03\",\n" +
                "      \"volume24\": 24386052825.577805,\n" +
                "      \"volume24a\": 28562243360.5568,\n" +
                "      \"csupply\": \"18281159.00\",\n" +
                "      \"tsupply\": \"18281159\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"80\",\n" +
                "      \"symbol\": \"ETH\",\n" +
                "      \"name\": \"Ethereum\",\n" +
                "      \"nameid\": \"ethereum\",\n" +
                "      \"rank\": 2,\n" +
                "      \"price_usd\": \"132.37\",\n" +
                "      \"percent_change_24h\": \"-0.61\",\n" +
                "      \"percent_change_1h\": \"0.31\",\n" +
                "      \"percent_change_7d\": \"-4.81\",\n" +
                "      \"price_btc\": \"0.020880\",\n" +
                "      \"market_cap_usd\": \"14586924305.11\",\n" +
                "      \"volume24\": 9036629156.381594,\n" +
                "      \"volume24a\": 9703336681.75381,\n" +
                "      \"csupply\": \"110196485.00\",\n" +
                "      \"tsupply\": \"110196485\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"58\",\n" +
                "      \"symbol\": \"XRP\",\n" +
                "      \"name\": \"XRP\",\n" +
                "      \"nameid\": \"ripple\",\n" +
                "      \"rank\": 3,\n" +
                "      \"price_usd\": \"0.173086\",\n" +
                "      \"percent_change_24h\": \"0.39\",\n" +
                "      \"percent_change_1h\": \"0.39\",\n" +
                "      \"percent_change_7d\": \"6.85\",\n" +
                "      \"price_btc\": \"0.000027\",\n" +
                "      \"market_cap_usd\": \"7427049038.86\",\n" +
                "      \"volume24\": 1615094498.6139147,\n" +
                "      \"volume24a\": 1579248436.859347,\n" +
                "      \"csupply\": \"42909539227.00\",\n" +
                "      \"tsupply\": \"99991841593\",\n" +
                "      \"msupply\": \"100000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"518\",\n" +
                "      \"symbol\": \"USDT\",\n" +
                "      \"name\": \"Tether\",\n" +
                "      \"nameid\": \"tether\",\n" +
                "      \"rank\": 4,\n" +
                "      \"price_usd\": \"1.00\",\n" +
                "      \"percent_change_24h\": \"0.08\",\n" +
                "      \"percent_change_1h\": \"-0.01\",\n" +
                "      \"percent_change_7d\": \"0.16\",\n" +
                "      \"price_btc\": \"0.000158\",\n" +
                "      \"market_cap_usd\": \"4061607123.64\",\n" +
                "      \"volume24\": 30121542088.905872,\n" +
                "      \"volume24a\": 34397572356.7879,\n" +
                "      \"csupply\": \"4049107372.00\",\n" +
                "      \"tsupply\": \"4049107372\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2321\",\n" +
                "      \"symbol\": \"BCH\",\n" +
                "      \"name\": \"Bitcoin Cash\",\n" +
                "      \"nameid\": \"bitcoin-cash\",\n" +
                "      \"rank\": 5,\n" +
                "      \"price_usd\": \"217.12\",\n" +
                "      \"percent_change_24h\": \"-2.21\",\n" +
                "      \"percent_change_1h\": \"0.30\",\n" +
                "      \"percent_change_7d\": \"-3.80\",\n" +
                "      \"price_btc\": \"0.034248\",\n" +
                "      \"market_cap_usd\": \"3982885192.65\",\n" +
                "      \"volume24\": 1995535944.285363,\n" +
                "      \"volume24a\": 2173592448.5212965,\n" +
                "      \"csupply\": \"18343840.00\",\n" +
                "      \"tsupply\": \"18343840\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33234\",\n" +
                "      \"symbol\": \"BCHSV\",\n" +
                "      \"name\": \"Bitcoin SV\",\n" +
                "      \"nameid\": \"bitcoin-cash-sv\",\n" +
                "      \"rank\": 6,\n" +
                "      \"price_usd\": \"162.70\",\n" +
                "      \"percent_change_24h\": \"-2.91\",\n" +
                "      \"percent_change_1h\": \"-0.20\",\n" +
                "      \"percent_change_7d\": \"-8.72\",\n" +
                "      \"price_btc\": \"0.025663\",\n" +
                "      \"market_cap_usd\": \"2984131542.92\",\n" +
                "      \"volume24\": 1588641179.0238442,\n" +
                "      \"volume24a\": 1838793839.988393,\n" +
                "      \"csupply\": \"18341277.00\",\n" +
                "      \"tsupply\": \"21000000\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"1\",\n" +
                "      \"symbol\": \"LTC\",\n" +
                "      \"name\": \"Litecoin\",\n" +
                "      \"nameid\": \"litecoin\",\n" +
                "      \"rank\": 7,\n" +
                "      \"price_usd\": \"38.76\",\n" +
                "      \"percent_change_24h\": \"-0.56\",\n" +
                "      \"percent_change_1h\": \"0.25\",\n" +
                "      \"percent_change_7d\": \"-2.36\",\n" +
                "      \"price_btc\": \"0.006114\",\n" +
                "      \"market_cap_usd\": \"2504667728.44\",\n" +
                "      \"volume24\": 2706808798.3587832,\n" +
                "      \"volume24a\": 2769826554.349684,\n" +
                "      \"csupply\": \"64619858.00\",\n" +
                "      \"tsupply\": \"64619858\",\n" +
                "      \"msupply\": \"84000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2679\",\n" +
                "      \"symbol\": \"EOS\",\n" +
                "      \"name\": \"EOS\",\n" +
                "      \"nameid\": \"eos\",\n" +
                "      \"rank\": 8,\n" +
                "      \"price_usd\": \"2.21\",\n" +
                "      \"percent_change_24h\": \"-1.38\",\n" +
                "      \"percent_change_1h\": \"0.16\",\n" +
                "      \"percent_change_7d\": \"-5.38\",\n" +
                "      \"price_btc\": \"0.000349\",\n" +
                "      \"market_cap_usd\": \"2053284968.94\",\n" +
                "      \"volume24\": 2012345255.8494577,\n" +
                "      \"volume24a\": 2215612503.5252485,\n" +
                "      \"csupply\": \"929000281.00\",\n" +
                "      \"tsupply\": \"1006245120\",\n" +
                "      \"msupply\": \"1006245120\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2710\",\n" +
                "      \"symbol\": \"BNB\",\n" +
                "      \"name\": \"Binance Coin\",\n" +
                "      \"nameid\": \"binance-coin\",\n" +
                "      \"rank\": 9,\n" +
                "      \"price_usd\": \"12.41\",\n" +
                "      \"percent_change_24h\": \"0.92\",\n" +
                "      \"percent_change_1h\": \"0.89\",\n" +
                "      \"percent_change_7d\": \"0.64\",\n" +
                "      \"price_btc\": \"0.001957\",\n" +
                "      \"market_cap_usd\": \"1929607697.18\",\n" +
                "      \"volume24\": 314339937.9823281,\n" +
                "      \"volume24a\": 246930610.60537913,\n" +
                "      \"csupply\": \"155536713.00\",\n" +
                "      \"tsupply\": \"192443301\",\n" +
                "      \"msupply\": \"200000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"3682\",\n" +
                "      \"symbol\": \"XTZ\",\n" +
                "      \"name\": \"Tezos\",\n" +
                "      \"nameid\": \"tezos\",\n" +
                "      \"rank\": 10,\n" +
                "      \"price_usd\": \"1.58\",\n" +
                "      \"percent_change_24h\": \"-1.29\",\n" +
                "      \"percent_change_1h\": \"0.40\",\n" +
                "      \"percent_change_7d\": \"-8.78\",\n" +
                "      \"price_btc\": \"0.000250\",\n" +
                "      \"market_cap_usd\": \"1046151290.66\",\n" +
                "      \"volume24\": 64697100.95226405,\n" +
                "      \"volume24a\": 77053581.81555673,\n" +
                "      \"csupply\": \"660373612.00\",\n" +
                "      \"tsupply\": \"763306930\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33833\",\n" +
                "      \"symbol\": \"LEO\",\n" +
                "      \"name\": \"UNUS SED LEO\",\n" +
                "      \"nameid\": \"unus-sed-leo\",\n" +
                "      \"rank\": 11,\n" +
                "      \"price_usd\": \"1.04\",\n" +
                "      \"percent_change_24h\": \"0.21\",\n" +
                "      \"percent_change_1h\": \"0.06\",\n" +
                "      \"percent_change_7d\": \"3.04\",\n" +
                "      \"price_btc\": \"0.000165\",\n" +
                "      \"market_cap_usd\": \"1043260176.09\",\n" +
                "      \"volume24\": 1573881.9890200014,\n" +
                "      \"volume24a\": 2420602.102830708,\n" +
                "      \"csupply\": \"999498893.00\",\n" +
                "      \"tsupply\": \"999498893\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"89\",\n" +
                "      \"symbol\": \"XLM\",\n" +
                "      \"name\": \"Stellar\",\n" +
                "      \"nameid\": \"stellar\",\n" +
                "      \"rank\": 12,\n" +
                "      \"price_usd\": \"0.040127\",\n" +
                "      \"percent_change_24h\": \"-1.10\",\n" +
                "      \"percent_change_1h\": \"-0.27\",\n" +
                "      \"percent_change_7d\": \"0.68\",\n" +
                "      \"price_btc\": \"0.000006\",\n" +
                "      \"market_cap_usd\": \"813915037.50\",\n" +
                "      \"volume24\": 284983125.1224881,\n" +
                "      \"volume24a\": 259184779.23515353,\n" +
                "      \"csupply\": \"20283516588.00\",\n" +
                "      \"tsupply\": \"104303927518\",\n" +
                "      \"msupply\": \"104303927518\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"28\",\n" +
                "      \"symbol\": \"XMR\",\n" +
                "      \"name\": \"Monero\",\n" +
                "      \"nameid\": \"monero\",\n" +
                "      \"rank\": 13,\n" +
                "      \"price_usd\": \"46.66\",\n" +
                "      \"percent_change_24h\": \"-0.10\",\n" +
                "      \"percent_change_1h\": \"-0.54\",\n" +
                "      \"percent_change_7d\": \"0.49\",\n" +
                "      \"price_btc\": \"0.007360\",\n" +
                "      \"market_cap_usd\": \"801346076.46\",\n" +
                "      \"volume24\": 112813639.97586201,\n" +
                "      \"volume24a\": 115929685.65474935,\n" +
                "      \"csupply\": \"17174299.00\",\n" +
                "      \"tsupply\": \"17174299\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"257\",\n" +
                "      \"symbol\": \"ADA\",\n" +
                "      \"name\": \"Cardano\",\n" +
                "      \"nameid\": \"cardano\",\n" +
                "      \"rank\": 14,\n" +
                "      \"price_usd\": \"0.030461\",\n" +
                "      \"percent_change_24h\": \"1.38\",\n" +
                "      \"percent_change_1h\": \"1.09\",\n" +
                "      \"percent_change_7d\": \"2.31\",\n" +
                "      \"price_btc\": \"0.000005\",\n" +
                "      \"market_cap_usd\": \"789771683.03\",\n" +
                "      \"volume24\": 68580697.84425175,\n" +
                "      \"volume24a\": 70842366.11541446,\n" +
                "      \"csupply\": \"25927070538.00\",\n" +
                "      \"tsupply\": \"31112483745\",\n" +
                "      \"msupply\": \"45000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2751\",\n" +
                "      \"symbol\": \"LINK\",\n" +
                "      \"name\": \"ChainLink\",\n" +
                "      \"nameid\": \"chainlink\",\n" +
                "      \"rank\": 15,\n" +
                "      \"price_usd\": \"2.23\",\n" +
                "      \"percent_change_24h\": \"3.86\",\n" +
                "      \"percent_change_1h\": \"0.70\",\n" +
                "      \"percent_change_7d\": \"-3.66\",\n" +
                "      \"price_btc\": \"0.000352\",\n" +
                "      \"market_cap_usd\": \"780424974.91\",\n" +
                "      \"volume24\": 201870544.78481796,\n" +
                "      \"volume24a\": 182727373.1163723,\n" +
                "      \"csupply\": \"350000000.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"1000000000 \"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2713\",\n" +
                "      \"symbol\": \"TRX\",\n" +
                "      \"name\": \"TRON\",\n" +
                "      \"nameid\": \"tron\",\n" +
                "      \"rank\": 16,\n" +
                "      \"price_usd\": \"0.011515\",\n" +
                "      \"percent_change_24h\": \"-0.32\",\n" +
                "      \"percent_change_1h\": \"0.54\",\n" +
                "      \"percent_change_7d\": \"0.74\",\n" +
                "      \"price_btc\": \"0.000002\",\n" +
                "      \"market_cap_usd\": \"767875992.21\",\n" +
                "      \"volume24\": 548305230.6286013,\n" +
                "      \"volume24a\": 784240933.9262756,\n" +
                "      \"csupply\": \"66682072191.00\",\n" +
                "      \"tsupply\": \"99000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"8\",\n" +
                "      \"symbol\": \"DASH\",\n" +
                "      \"name\": \"Dash\",\n" +
                "      \"nameid\": \"dash\",\n" +
                "      \"rank\": 17,\n" +
                "      \"price_usd\": \"64.16\",\n" +
                "      \"percent_change_24h\": \"-2.77\",\n" +
                "      \"percent_change_1h\": \"-0.41\",\n" +
                "      \"percent_change_7d\": \"-7.93\",\n" +
                "      \"price_btc\": \"0.010120\",\n" +
                "      \"market_cap_usd\": \"602646900.36\",\n" +
                "      \"volume24\": 451039661.50607103,\n" +
                "      \"volume24a\": 521123460.69894165,\n" +
                "      \"csupply\": \"9393253.00\",\n" +
                "      \"tsupply\": \"9393253\",\n" +
                "      \"msupply\": \"18900000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"118\",\n" +
                "      \"symbol\": \"ETC\",\n" +
                "      \"name\": \"Ethereum Classic\",\n" +
                "      \"nameid\": \"ethereum-classic\",\n" +
                "      \"rank\": 18,\n" +
                "      \"price_usd\": \"4.85\",\n" +
                "      \"percent_change_24h\": \"-2.32\",\n" +
                "      \"percent_change_1h\": \"0.20\",\n" +
                "      \"percent_change_7d\": \"-3.79\",\n" +
                "      \"price_btc\": \"0.000765\",\n" +
                "      \"market_cap_usd\": \"548121794.10\",\n" +
                "      \"volume24\": 1379981393.6470492,\n" +
                "      \"volume24a\": 1470673661.5680354,\n" +
                "      \"csupply\": \"112980348.00\",\n" +
                "      \"tsupply\": \"112980348\",\n" +
                "      \"msupply\": \"210000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33538\",\n" +
                "      \"symbol\": \"MIN\",\n" +
                "      \"name\": \"MINDOL\",\n" +
                "      \"nameid\": \"mindol\",\n" +
                "      \"rank\": 19,\n" +
                "      \"price_usd\": \"3.09\",\n" +
                "      \"percent_change_24h\": \"4.86\",\n" +
                "      \"percent_change_1h\": \"0.92\",\n" +
                "      \"percent_change_7d\": \"1.85\",\n" +
                "      \"price_btc\": \"0.000488\",\n" +
                "      \"market_cap_usd\": \"480633307.74\",\n" +
                "      \"volume24\": 628004.40278311,\n" +
                "      \"volume24a\": 755441.4492503982,\n" +
                "      \"csupply\": \"155379617.00\",\n" +
                "      \"tsupply\": \"240000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"133\",\n" +
                "      \"symbol\": \"NEO\",\n" +
                "      \"name\": \"Neo\",\n" +
                "      \"nameid\": \"neo\",\n" +
                "      \"rank\": 20,\n" +
                "      \"price_usd\": \"6.71\",\n" +
                "      \"percent_change_24h\": \"1.00\",\n" +
                "      \"percent_change_1h\": \"0.25\",\n" +
                "      \"percent_change_7d\": \"-2.05\",\n" +
                "      \"price_btc\": \"0.001059\",\n" +
                "      \"market_cap_usd\": \"473477576.24\",\n" +
                "      \"volume24\": 446469975.3382667,\n" +
                "      \"volume24a\": 383281091.0250344,\n" +
                "      \"csupply\": \"70538831.00\",\n" +
                "      \"tsupply\": \"100000000\",\n" +
                "      \"msupply\": \"100000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33608\",\n" +
                "      \"symbol\": \"HEDG\",\n" +
                "      \"name\": \"HedgeTrade\",\n" +
                "      \"nameid\": \"hedgetrade\",\n" +
                "      \"rank\": 21,\n" +
                "      \"price_usd\": \"1.57\",\n" +
                "      \"percent_change_24h\": \"-4.91\",\n" +
                "      \"percent_change_1h\": \"0.39\",\n" +
                "      \"percent_change_7d\": \"-9.21\",\n" +
                "      \"price_btc\": \"0.000247\",\n" +
                "      \"market_cap_usd\": \"451421697.39\",\n" +
                "      \"volume24\": 416662.90582415747,\n" +
                "      \"volume24a\": 466394.89404419006,\n" +
                "      \"csupply\": \"288393355.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33285\",\n" +
                "      \"symbol\": \"USDC\",\n" +
                "      \"name\": \"USD Coin\",\n" +
                "      \"nameid\": \"usd-coin\",\n" +
                "      \"rank\": 22,\n" +
                "      \"price_usd\": \"0.998269\",\n" +
                "      \"percent_change_24h\": \"-0.02\",\n" +
                "      \"percent_change_1h\": \"0.02\",\n" +
                "      \"percent_change_7d\": \"0.14\",\n" +
                "      \"price_btc\": \"0.000157\",\n" +
                "      \"market_cap_usd\": \"434279265.82\",\n" +
                "      \"volume24\": 198888765.86982298,\n" +
                "      \"volume24a\": 232810113.60492608,\n" +
                "      \"csupply\": \"435032301.00\",\n" +
                "      \"tsupply\": \"435032301\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33819\",\n" +
                "      \"symbol\": \"CRO\",\n" +
                "      \"name\": \"Crypto.com Chain\",\n" +
                "      \"nameid\": \"crypto-com-chain\",\n" +
                "      \"rank\": 23,\n" +
                "      \"price_usd\": \"0.042742\",\n" +
                "      \"percent_change_24h\": \"-2.04\",\n" +
                "      \"percent_change_1h\": \"-0.26\",\n" +
                "      \"percent_change_7d\": \"-1.07\",\n" +
                "      \"price_btc\": \"0.000007\",\n" +
                "      \"market_cap_usd\": \"396682554.94\",\n" +
                "      \"volume24\": 4703974.793923919,\n" +
                "      \"volume24a\": 4971228.960484285,\n" +
                "      \"csupply\": \"9280821918.00\",\n" +
                "      \"tsupply\": \"100000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"447\",\n" +
                "      \"symbol\": \"IOTA\",\n" +
                "      \"name\": \"IOTA\",\n" +
                "      \"nameid\": \"iota\",\n" +
                "      \"rank\": 24,\n" +
                "      \"price_usd\": \"0.142130\",\n" +
                "      \"percent_change_24h\": \"-0.11\",\n" +
                "      \"percent_change_1h\": \"0.51\",\n" +
                "      \"percent_change_7d\": \"-0.23\",\n" +
                "      \"price_btc\": \"0.000022\",\n" +
                "      \"market_cap_usd\": \"395053647.42\",\n" +
                "      \"volume24\": 11240458.413640106,\n" +
                "      \"volume24a\": 11170028.884060532,\n" +
                "      \"csupply\": \"2779530283.00\",\n" +
                "      \"tsupply\": \"2779530283\",\n" +
                "      \"msupply\": \"2779530283\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33830\",\n" +
                "      \"symbol\": \"ATOM\",\n" +
                "      \"name\": \"Cosmos\",\n" +
                "      \"nameid\": \"cosmos\",\n" +
                "      \"rank\": 25,\n" +
                "      \"price_usd\": \"1.94\",\n" +
                "      \"percent_change_24h\": \"-2.17\",\n" +
                "      \"percent_change_1h\": \"0.18\",\n" +
                "      \"percent_change_7d\": \"-9.94\",\n" +
                "      \"price_btc\": \"0.000306\",\n" +
                "      \"market_cap_usd\": \"369608947.07\",\n" +
                "      \"volume24\": 88577424.74262406,\n" +
                "      \"volume24a\": 102931063.69577359,\n" +
                "      \"csupply\": \"190688439.00\",\n" +
                "      \"tsupply\": \"237928231\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"70\",\n" +
                "      \"symbol\": \"NEM\",\n" +
                "      \"name\": \"NEM\",\n" +
                "      \"nameid\": \"nem\",\n" +
                "      \"rank\": 26,\n" +
                "      \"price_usd\": \"0.036178\",\n" +
                "      \"percent_change_24h\": \"-2.92\",\n" +
                "      \"percent_change_1h\": \"0.34\",\n" +
                "      \"percent_change_7d\": \"-9.97\",\n" +
                "      \"price_btc\": \"0.000006\",\n" +
                "      \"market_cap_usd\": \"325605246.22\",\n" +
                "      \"volume24\": 15162303.09110235,\n" +
                "      \"volume24a\": 29245646.027561843,\n" +
                "      \"csupply\": \"8999999999.00\",\n" +
                "      \"tsupply\": \"8999999999\",\n" +
                "      \"msupply\": \"8999999999\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"134\",\n" +
                "      \"symbol\": \"ZEC\",\n" +
                "      \"name\": \"Zcash\",\n" +
                "      \"nameid\": \"zcash\",\n" +
                "      \"rank\": 27,\n" +
                "      \"price_usd\": \"30.69\",\n" +
                "      \"percent_change_24h\": \"-0.66\",\n" +
                "      \"percent_change_1h\": \"0.18\",\n" +
                "      \"percent_change_7d\": \"-6.08\",\n" +
                "      \"price_btc\": \"0.004842\",\n" +
                "      \"market_cap_usd\": \"291490195.26\",\n" +
                "      \"volume24\": 320577973.3275142,\n" +
                "      \"volume24a\": 357506598.9599416,\n" +
                "      \"csupply\": \"9496456.00\",\n" +
                "      \"tsupply\": \"9496456\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"12377\",\n" +
                "      \"symbol\": \"MKR\",\n" +
                "      \"name\": \"Maker\",\n" +
                "      \"nameid\": \"maker\",\n" +
                "      \"rank\": 28,\n" +
                "      \"price_usd\": \"290.56\",\n" +
                "      \"percent_change_24h\": \"-2.66\",\n" +
                "      \"percent_change_1h\": \"1.03\",\n" +
                "      \"percent_change_7d\": \"3.43\",\n" +
                "      \"price_btc\": \"0.045832\",\n" +
                "      \"market_cap_usd\": \"290564047.47\",\n" +
                "      \"volume24\": 3082856.2753531644,\n" +
                "      \"volume24a\": 3832159.533886347,\n" +
                "      \"csupply\": \"1000000.00\",\n" +
                "      \"tsupply\": \"1000000\",\n" +
                "      \"msupply\": \"1000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33061\",\n" +
                "      \"symbol\": \"INB\",\n" +
                "      \"name\": \"Insight Chain\",\n" +
                "      \"nameid\": \"insight-chain\",\n" +
                "      \"rank\": 29,\n" +
                "      \"price_usd\": \"0.771200\",\n" +
                "      \"percent_change_24h\": \"1.84\",\n" +
                "      \"percent_change_1h\": \"0.25\",\n" +
                "      \"percent_change_7d\": \"0.93\",\n" +
                "      \"price_btc\": \"0.000122\",\n" +
                "      \"market_cap_usd\": \"269844953.76\",\n" +
                "      \"volume24\": 21053337.000445463,\n" +
                "      \"volume24a\": 16841562.854087044,\n" +
                "      \"csupply\": \"349902689.00\",\n" +
                "      \"tsupply\": \"10000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2\",\n" +
                "      \"symbol\": \"DOGE\",\n" +
                "      \"name\": \"Dogecoin\",\n" +
                "      \"nameid\": \"dogecoin\",\n" +
                "      \"rank\": 30,\n" +
                "      \"price_usd\": \"0.001827\",\n" +
                "      \"percent_change_24h\": \"-1.07\",\n" +
                "      \"percent_change_1h\": \"0.23\",\n" +
                "      \"percent_change_7d\": \"-3.37\",\n" +
                "      \"price_btc\": \"2.88E-7\",\n" +
                "      \"market_cap_usd\": \"225995045.18\",\n" +
                "      \"volume24\": 120349431.70330012,\n" +
                "      \"volume24a\": 127040233.77393724,\n" +
                "      \"csupply\": \"123727126384.00\",\n" +
                "      \"tsupply\": \"123727126384\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32331\",\n" +
                "      \"symbol\": \"ONT\",\n" +
                "      \"name\": \"Ontology\",\n" +
                "      \"nameid\": \"ontology\",\n" +
                "      \"rank\": 31,\n" +
                "      \"price_usd\": \"0.368342\",\n" +
                "      \"percent_change_24h\": \"-0.07\",\n" +
                "      \"percent_change_1h\": \"1.29\",\n" +
                "      \"percent_change_7d\": \"-5.96\",\n" +
                "      \"price_btc\": \"0.000058\",\n" +
                "      \"market_cap_usd\": \"196504408.84\",\n" +
                "      \"volume24\": 45204818.03328492,\n" +
                "      \"volume24a\": 42167073.28798064,\n" +
                "      \"csupply\": \"533483170.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32479\",\n" +
                "      \"symbol\": \"TUSD\",\n" +
                "      \"name\": \"TrueUSD\",\n" +
                "      \"nameid\": \"trueusd\",\n" +
                "      \"rank\": 32,\n" +
                "      \"price_usd\": \"0.996097\",\n" +
                "      \"percent_change_24h\": \"-0.18\",\n" +
                "      \"percent_change_1h\": \"-0.01\",\n" +
                "      \"percent_change_7d\": \"0.03\",\n" +
                "      \"price_btc\": \"0.000157\",\n" +
                "      \"market_cap_usd\": \"194720193.75\",\n" +
                "      \"volume24\": 302784878.1862417,\n" +
                "      \"volume24a\": 421183384.63423264,\n" +
                "      \"csupply\": \"195483256.00\",\n" +
                "      \"tsupply\": \"195483256\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33820\",\n" +
                "      \"symbol\": \"PAX\",\n" +
                "      \"name\": \"Paxos Standard Token\",\n" +
                "      \"nameid\": \"paxos-standard-token\",\n" +
                "      \"rank\": 33,\n" +
                "      \"price_usd\": \"0.998738\",\n" +
                "      \"percent_change_24h\": \"0.01\",\n" +
                "      \"percent_change_1h\": \"0.03\",\n" +
                "      \"percent_change_7d\": \"0.08\",\n" +
                "      \"price_btc\": \"0.000158\",\n" +
                "      \"market_cap_usd\": \"194121672.75\",\n" +
                "      \"volume24\": 418287919.9066412,\n" +
                "      \"volume24a\": 462617098.2248333,\n" +
                "      \"csupply\": \"194366961.00\",\n" +
                "      \"tsupply\": \"194366961\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"184\",\n" +
                "      \"symbol\": \"BAT\",\n" +
                "      \"name\": \"Basic Attention Token\",\n" +
                "      \"nameid\": \"basic-attention-token\",\n" +
                "      \"rank\": 34,\n" +
                "      \"price_usd\": \"0.139268\",\n" +
                "      \"percent_change_24h\": \"-0.92\",\n" +
                "      \"percent_change_1h\": \"0.12\",\n" +
                "      \"percent_change_7d\": \"1.61\",\n" +
                "      \"price_btc\": \"0.000022\",\n" +
                "      \"market_cap_usd\": \"178155659.70\",\n" +
                "      \"volume24\": 50111824.933594406,\n" +
                "      \"volume24a\": 59755656.33561984,\n" +
                "      \"csupply\": \"1279225522.00\",\n" +
                "      \"tsupply\": \"1500000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2741\",\n" +
                "      \"symbol\": \"VET\",\n" +
                "      \"name\": \"VeChain\",\n" +
                "      \"nameid\": \"vechain\",\n" +
                "      \"rank\": 35,\n" +
                "      \"price_usd\": \"0.003066\",\n" +
                "      \"percent_change_24h\": \"3.72\",\n" +
                "      \"percent_change_1h\": \"0.24\",\n" +
                "      \"percent_change_7d\": \"5.48\",\n" +
                "      \"price_btc\": \"4.84E-7\",\n" +
                "      \"market_cap_usd\": \"170048753.11\",\n" +
                "      \"volume24\": 104261385.2451619,\n" +
                "      \"volume24a\": 80762586.95929377,\n" +
                "      \"csupply\": \"55454734800.00\",\n" +
                "      \"tsupply\": \"86712634466\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32351\",\n" +
                "      \"symbol\": \"HT\",\n" +
                "      \"name\": \"Huobi Token\",\n" +
                "      \"nameid\": \"huobi-token\",\n" +
                "      \"rank\": 36,\n" +
                "      \"price_usd\": \"3.28\",\n" +
                "      \"percent_change_24h\": \"-0.86\",\n" +
                "      \"percent_change_1h\": \"-0.39\",\n" +
                "      \"percent_change_7d\": \"-3.80\",\n" +
                "      \"price_btc\": \"0.000517\",\n" +
                "      \"market_cap_usd\": \"163860141.37\",\n" +
                "      \"volume24\": 98584625.75494069,\n" +
                "      \"volume24a\": 119619073.1736908,\n" +
                "      \"csupply\": \"50000200.00\",\n" +
                "      \"tsupply\": \"500000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"99\",\n" +
                "      \"symbol\": \"DCR\",\n" +
                "      \"name\": \"Decred\",\n" +
                "      \"nameid\": \"decred\",\n" +
                "      \"rank\": 37,\n" +
                "      \"price_usd\": \"11.47\",\n" +
                "      \"percent_change_24h\": \"1.06\",\n" +
                "      \"percent_change_1h\": \"1.21\",\n" +
                "      \"percent_change_7d\": \"-1.67\",\n" +
                "      \"price_btc\": \"0.001809\",\n" +
                "      \"market_cap_usd\": \"129119604.34\",\n" +
                "      \"volume24\": 70656543.85049456,\n" +
                "      \"volume24a\": 66685858.29676472,\n" +
                "      \"csupply\": \"11255663.00\",\n" +
                "      \"tsupply\": \"11255663\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"3708\",\n" +
                "      \"symbol\": \"ICX\",\n" +
                "      \"name\": \"ICON\",\n" +
                "      \"nameid\": \"icon\",\n" +
                "      \"rank\": 38,\n" +
                "      \"price_usd\": \"0.256761\",\n" +
                "      \"percent_change_24h\": \"21.90\",\n" +
                "      \"percent_change_1h\": \"18.64\",\n" +
                "      \"percent_change_7d\": \"24.80\",\n" +
                "      \"price_btc\": \"0.000040\",\n" +
                "      \"market_cap_usd\": \"125929433.19\",\n" +
                "      \"volume24\": 32971551.518256057,\n" +
                "      \"volume24a\": 23613658.25214948,\n" +
                "      \"csupply\": \"490453303.00\",\n" +
                "      \"tsupply\": \"800460000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"285\",\n" +
                "      \"symbol\": \"BTG\",\n" +
                "      \"name\": \"Bitcoin Gold\",\n" +
                "      \"nameid\": \"bitcoingold\",\n" +
                "      \"rank\": 39,\n" +
                "      \"price_usd\": \"7.10\",\n" +
                "      \"percent_change_24h\": \"-2.35\",\n" +
                "      \"percent_change_1h\": \"0.06\",\n" +
                "      \"percent_change_7d\": \"-6.88\",\n" +
                "      \"price_btc\": \"0.001120\",\n" +
                "      \"market_cap_usd\": \"122493497.94\",\n" +
                "      \"volume24\": 16829938.055298958,\n" +
                "      \"volume24a\": 17695174.64053691,\n" +
                "      \"csupply\": \"17248611.00\",\n" +
                "      \"tsupply\": \"17348611\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"237\",\n" +
                "      \"symbol\": \"QTUM\",\n" +
                "      \"name\": \"Qtum\",\n" +
                "      \"nameid\": \"qtum\",\n" +
                "      \"rank\": 40,\n" +
                "      \"price_usd\": \"1.21\",\n" +
                "      \"percent_change_24h\": \"0.29\",\n" +
                "      \"percent_change_1h\": \"0.43\",\n" +
                "      \"percent_change_7d\": \"-4.09\",\n" +
                "      \"price_btc\": \"0.000191\",\n" +
                "      \"market_cap_usd\": \"116386722.80\",\n" +
                "      \"volume24\": 324414086.0666177,\n" +
                "      \"volume24a\": 341667500.0392862,\n" +
                "      \"csupply\": \"95969372.00\",\n" +
                "      \"tsupply\": \"100909224\",\n" +
                "      \"msupply\": \"100909224\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"108\",\n" +
                "      \"symbol\": \"LSK\",\n" +
                "      \"name\": \"Lisk\",\n" +
                "      \"nameid\": \"lisk\",\n" +
                "      \"rank\": 41,\n" +
                "      \"price_usd\": \"0.957163\",\n" +
                "      \"percent_change_24h\": \"-1.18\",\n" +
                "      \"percent_change_1h\": \"-0.47\",\n" +
                "      \"percent_change_7d\": \"-7.57\",\n" +
                "      \"price_btc\": \"0.000151\",\n" +
                "      \"market_cap_usd\": \"114489384.37\",\n" +
                "      \"volume24\": 2667508.420457574,\n" +
                "      \"volume24a\": 2654655.608849908,\n" +
                "      \"csupply\": \"119613215.00\",\n" +
                "      \"tsupply\": \"125643660\",\n" +
                "      \"msupply\": \"159918400\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"129\",\n" +
                "      \"symbol\": \"REP\",\n" +
                "      \"name\": \"Augur\",\n" +
                "      \"nameid\": \"augur\",\n" +
                "      \"rank\": 42,\n" +
                "      \"price_usd\": \"10.00\",\n" +
                "      \"percent_change_24h\": \"-1.80\",\n" +
                "      \"percent_change_1h\": \"-0.17\",\n" +
                "      \"percent_change_7d\": \"16.00\",\n" +
                "      \"price_btc\": \"0.001577\",\n" +
                "      \"market_cap_usd\": \"109961911.66\",\n" +
                "      \"volume24\": 10900760.745121358,\n" +
                "      \"volume24a\": 10017142.736063302,\n" +
                "      \"csupply\": \"11000000.00\",\n" +
                "      \"tsupply\": \"11000000\",\n" +
                "      \"msupply\": \"11000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"113\",\n" +
                "      \"symbol\": \"WAVES\",\n" +
                "      \"name\": \"Waves\",\n" +
                "      \"nameid\": \"waves\",\n" +
                "      \"rank\": 43,\n" +
                "      \"price_usd\": \"0.957337\",\n" +
                "      \"percent_change_24h\": \"14.65\",\n" +
                "      \"percent_change_1h\": \"-1.24\",\n" +
                "      \"percent_change_7d\": \"2.20\",\n" +
                "      \"price_btc\": \"0.000151\",\n" +
                "      \"market_cap_usd\": \"95733700.54\",\n" +
                "      \"volume24\": 114745244.61979234,\n" +
                "      \"volume24a\": 41399552.370066844,\n" +
                "      \"csupply\": \"100000000.00\",\n" +
                "      \"tsupply\": \"100000000\",\n" +
                "      \"msupply\": \"100000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33821\",\n" +
                "      \"symbol\": \"ABBC\",\n" +
                "      \"name\": \"ABBC Coin\",\n" +
                "      \"nameid\": \"abbc-coin\",\n" +
                "      \"rank\": 44,\n" +
                "      \"price_usd\": \"0.090482\",\n" +
                "      \"percent_change_24h\": \"-1.96\",\n" +
                "      \"percent_change_1h\": \"0.02\",\n" +
                "      \"percent_change_7d\": \"-7.67\",\n" +
                "      \"price_btc\": \"0.000014\",\n" +
                "      \"market_cap_usd\": \"90841756.29\",\n" +
                "      \"volume24\": 15950904.246685712,\n" +
                "      \"volume24a\": 20419293.39168319,\n" +
                "      \"csupply\": \"1003981087.00\",\n" +
                "      \"tsupply\": \"1003981087\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2729\",\n" +
                "      \"symbol\": \"ZRX\",\n" +
                "      \"name\": \"0x\",\n" +
                "      \"nameid\": \"0x\",\n" +
                "      \"rank\": 45,\n" +
                "      \"price_usd\": \"0.150808\",\n" +
                "      \"percent_change_24h\": \"-0.81\",\n" +
                "      \"percent_change_1h\": \"0.23\",\n" +
                "      \"percent_change_7d\": \"-2.69\",\n" +
                "      \"price_btc\": \"0.000024\",\n" +
                "      \"market_cap_usd\": \"90556398.99\",\n" +
                "      \"volume24\": 10404982.159060137,\n" +
                "      \"volume24a\": 11771254.880950857,\n" +
                "      \"csupply\": \"600475853.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"1000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32073\",\n" +
                "      \"symbol\": \"BCD\",\n" +
                "      \"name\": \"Bitcoin Diamond\",\n" +
                "      \"nameid\": \"bitcoin-diamond\",\n" +
                "      \"rank\": 46,\n" +
                "      \"price_usd\": \"0.471899\",\n" +
                "      \"percent_change_24h\": \"-4.37\",\n" +
                "      \"percent_change_1h\": \"0.22\",\n" +
                "      \"percent_change_7d\": \"-5.14\",\n" +
                "      \"price_btc\": \"0.000074\",\n" +
                "      \"market_cap_usd\": \"88005807.30\",\n" +
                "      \"volume24\": 5580534.488039584,\n" +
                "      \"volume24a\": 6099275.080199219,\n" +
                "      \"csupply\": \"186492898.00\",\n" +
                "      \"tsupply\": \"186492898\",\n" +
                "      \"msupply\": \"210000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33531\",\n" +
                "      \"symbol\": \"OKB\",\n" +
                "      \"name\": \"OKB\",\n" +
                "      \"nameid\": \"okb\",\n" +
                "      \"rank\": 47,\n" +
                "      \"price_usd\": \"4.27\",\n" +
                "      \"percent_change_24h\": \"-0.68\",\n" +
                "      \"percent_change_1h\": \"0.37\",\n" +
                "      \"percent_change_7d\": \"-2.31\",\n" +
                "      \"price_btc\": \"0.000674\",\n" +
                "      \"market_cap_usd\": \"85411446.15\",\n" +
                "      \"volume24\": 230215715.59025022,\n" +
                "      \"volume24a\": 232939938.8151168,\n" +
                "      \"csupply\": \"20000000.00\",\n" +
                "      \"tsupply\": \"300000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2750\",\n" +
                "      \"symbol\": \"KCS\",\n" +
                "      \"name\": \"KuCoin Shares\",\n" +
                "      \"nameid\": \"kucoin-shares\",\n" +
                "      \"rank\": 48,\n" +
                "      \"price_usd\": \"0.919205\",\n" +
                "      \"percent_change_24h\": \"-3.99\",\n" +
                "      \"percent_change_1h\": \"-0.35\",\n" +
                "      \"percent_change_7d\": \"-20.44\",\n" +
                "      \"price_btc\": \"0.000145\",\n" +
                "      \"market_cap_usd\": \"81575500.02\",\n" +
                "      \"volume24\": 6373015.583827225,\n" +
                "      \"volume24a\": 6031997.814402604,\n" +
                "      \"csupply\": \"88745681.00\",\n" +
                "      \"tsupply\": \"180730576\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32417\",\n" +
                "      \"symbol\": \"DAI\",\n" +
                "      \"name\": \"Dai\",\n" +
                "      \"nameid\": \"dai\",\n" +
                "      \"rank\": 49,\n" +
                "      \"price_usd\": \"1.02\",\n" +
                "      \"percent_change_24h\": \"0.38\",\n" +
                "      \"percent_change_1h\": \"-0.03\",\n" +
                "      \"percent_change_7d\": \"-1.16\",\n" +
                "      \"price_btc\": \"0.000162\",\n" +
                "      \"market_cap_usd\": \"80167821.64\",\n" +
                "      \"volume24\": 10310418.29748595,\n" +
                "      \"volume24a\": 10643858.110080648,\n" +
                "      \"csupply\": \"78262606.00\",\n" +
                "      \"tsupply\": \"78262606\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"22\",\n" +
                "      \"symbol\": \"MONA\",\n" +
                "      \"name\": \"MonaCoin\",\n" +
                "      \"nameid\": \"monacoin\",\n" +
                "      \"rank\": 50,\n" +
                "      \"price_usd\": \"1.18\",\n" +
                "      \"percent_change_24h\": \"-2.71\",\n" +
                "      \"percent_change_1h\": \"0.13\",\n" +
                "      \"percent_change_7d\": \"-6.82\",\n" +
                "      \"price_btc\": \"0.000186\",\n" +
                "      \"market_cap_usd\": \"77393627.84\",\n" +
                "      \"volume24\": 5626140.092648534,\n" +
                "      \"volume24a\": 4368377.375034848,\n" +
                "      \"csupply\": \"65729675.00\",\n" +
                "      \"tsupply\": \"65729675\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33723\",\n" +
                "      \"symbol\": \"SNX\",\n" +
                "      \"name\": \"Synthetix Network Token\",\n" +
                "      \"nameid\": \"synthetix-network-token\",\n" +
                "      \"rank\": 51,\n" +
                "      \"price_usd\": \"0.611380\",\n" +
                "      \"percent_change_24h\": \"0.66\",\n" +
                "      \"percent_change_1h\": \"1.49\",\n" +
                "      \"percent_change_7d\": \"20.24\",\n" +
                "      \"price_btc\": \"0.000096\",\n" +
                "      \"market_cap_usd\": \"77008716.76\",\n" +
                "      \"volume24\": 1616156.960039826,\n" +
                "      \"volume24a\": 964986.2261891192,\n" +
                "      \"csupply\": \"125958830.00\",\n" +
                "      \"tsupply\": \"125958830\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"211\",\n" +
                "      \"symbol\": \"MCO\",\n" +
                "      \"name\": \"Crypto.com\",\n" +
                "      \"nameid\": \"monaco\",\n" +
                "      \"rank\": 52,\n" +
                "      \"price_usd\": \"4.75\",\n" +
                "      \"percent_change_24h\": \"-1.35\",\n" +
                "      \"percent_change_1h\": \"0.23\",\n" +
                "      \"percent_change_7d\": \"3.50\",\n" +
                "      \"price_btc\": \"0.000749\",\n" +
                "      \"market_cap_usd\": \"75037695.28\",\n" +
                "      \"volume24\": 32819478.585833278,\n" +
                "      \"volume24a\": 24027545.1588933,\n" +
                "      \"csupply\": \"15793831.00\",\n" +
                "      \"tsupply\": \"31587682\",\n" +
                "      \"msupply\": \"31587682.3632061\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2515\",\n" +
                "      \"symbol\": \"KNC\",\n" +
                "      \"name\": \"Kyber Network\",\n" +
                "      \"nameid\": \"kyber-network\",\n" +
                "      \"rank\": 53,\n" +
                "      \"price_usd\": \"0.430330\",\n" +
                "      \"percent_change_24h\": \"-2.77\",\n" +
                "      \"percent_change_1h\": \"0.05\",\n" +
                "      \"percent_change_7d\": \"-8.55\",\n" +
                "      \"price_btc\": \"0.000068\",\n" +
                "      \"market_cap_usd\": \"72237157.52\",\n" +
                "      \"volume24\": 36316066.98094686,\n" +
                "      \"volume24a\": 39476828.211049296,\n" +
                "      \"csupply\": \"167864614.00\",\n" +
                "      \"tsupply\": \"215625349\",\n" +
                "      \"msupply\": \"226000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"232\",\n" +
                "      \"symbol\": \"OMG\",\n" +
                "      \"name\": \"OmiseGO\",\n" +
                "      \"nameid\": \"omisego\",\n" +
                "      \"rank\": 54,\n" +
                "      \"price_usd\": \"0.512356\",\n" +
                "      \"percent_change_24h\": \"-0.74\",\n" +
                "      \"percent_change_1h\": \"0.03\",\n" +
                "      \"percent_change_7d\": \"-2.28\",\n" +
                "      \"price_btc\": \"0.000081\",\n" +
                "      \"market_cap_usd\": \"71855622.29\",\n" +
                "      \"volume24\": 81200955.73905385,\n" +
                "      \"volume24a\": 111824288.5913425,\n" +
                "      \"csupply\": \"140245398.00\",\n" +
                "      \"tsupply\": \"140245398\",\n" +
                "      \"msupply\": \"140245398\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2581\",\n" +
                "      \"symbol\": \"ENJ\",\n" +
                "      \"name\": \"Enjin Coin\",\n" +
                "      \"nameid\": \"enjin-coin\",\n" +
                "      \"rank\": 55,\n" +
                "      \"price_usd\": \"0.090475\",\n" +
                "      \"percent_change_24h\": \"-4.55\",\n" +
                "      \"percent_change_1h\": \"-0.13\",\n" +
                "      \"percent_change_7d\": \"16.22\",\n" +
                "      \"price_btc\": \"0.000014\",\n" +
                "      \"market_cap_usd\": \"70233813.92\",\n" +
                "      \"volume24\": 4399503.2255096305,\n" +
                "      \"volume24a\": 7925874.340557889,\n" +
                "      \"csupply\": \"776278713.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32386\",\n" +
                "      \"symbol\": \"RVN\",\n" +
                "      \"name\": \"Ravencoin\",\n" +
                "      \"nameid\": \"ravencoin\",\n" +
                "      \"rank\": 56,\n" +
                "      \"price_usd\": \"0.014984\",\n" +
                "      \"percent_change_24h\": \"0.42\",\n" +
                "      \"percent_change_1h\": \"0.22\",\n" +
                "      \"percent_change_7d\": \"-0.32\",\n" +
                "      \"price_btc\": \"0.000002\",\n" +
                "      \"market_cap_usd\": \"64078174.73\",\n" +
                "      \"volume24\": 10109938.159602752,\n" +
                "      \"volume24a\": 8635852.02931319,\n" +
                "      \"csupply\": \"4276480000.00\",\n" +
                "      \"tsupply\": \"4276480000\",\n" +
                "      \"msupply\": \"21000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2835\",\n" +
                "      \"symbol\": \"NANO\",\n" +
                "      \"name\": \"Nano\",\n" +
                "      \"nameid\": \"nano\",\n" +
                "      \"rank\": 57,\n" +
                "      \"price_usd\": \"0.470539\",\n" +
                "      \"percent_change_24h\": \"1.02\",\n" +
                "      \"percent_change_1h\": \"-1.20\",\n" +
                "      \"percent_change_7d\": \"-8.50\",\n" +
                "      \"price_btc\": \"0.000074\",\n" +
                "      \"market_cap_usd\": \"62698519.70\",\n" +
                "      \"volume24\": 1917357.0148982138,\n" +
                "      \"volume24a\": 2482138.46099041,\n" +
                "      \"csupply\": \"133248297.00\",\n" +
                "      \"tsupply\": \"133248297\",\n" +
                "      \"msupply\": \"133248297\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32604\",\n" +
                "      \"symbol\": \"NEXO\",\n" +
                "      \"name\": \"Nexo\",\n" +
                "      \"nameid\": \"nexo\",\n" +
                "      \"rank\": 58,\n" +
                "      \"price_usd\": \"0.108446\",\n" +
                "      \"percent_change_24h\": \"0.97\",\n" +
                "      \"percent_change_1h\": \"0.15\",\n" +
                "      \"percent_change_7d\": \"-2.21\",\n" +
                "      \"price_btc\": \"0.000017\",\n" +
                "      \"market_cap_usd\": \"60729690.03\",\n" +
                "      \"volume24\": 9779244.288747711,\n" +
                "      \"volume24a\": 9826285.332482057,\n" +
                "      \"csupply\": \"560000011.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"207\",\n" +
                "      \"symbol\": \"SNT\",\n" +
                "      \"name\": \"Status Network Token\",\n" +
                "      \"nameid\": \"status\",\n" +
                "      \"rank\": 59,\n" +
                "      \"price_usd\": \"0.017282\",\n" +
                "      \"percent_change_24h\": \"-5.62\",\n" +
                "      \"percent_change_1h\": \"-0.41\",\n" +
                "      \"percent_change_7d\": \"17.01\",\n" +
                "      \"price_btc\": \"0.000003\",\n" +
                "      \"market_cap_usd\": \"59975969.07\",\n" +
                "      \"volume24\": 34364317.6994637,\n" +
                "      \"volume24a\": 41409673.215450265,\n" +
                "      \"csupply\": \"3470483788.00\",\n" +
                "      \"tsupply\": \"6804870174\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33071\",\n" +
                "      \"symbol\": \"DX\",\n" +
                "      \"name\": \"DxChain Token\",\n" +
                "      \"nameid\": \"dxchain-token\",\n" +
                "      \"rank\": 60,\n" +
                "      \"price_usd\": \"0.001272\",\n" +
                "      \"percent_change_24h\": \"1.12\",\n" +
                "      \"percent_change_1h\": \"-1.98\",\n" +
                "      \"percent_change_7d\": \"-1.90\",\n" +
                "      \"price_btc\": \"2.01E-7\",\n" +
                "      \"market_cap_usd\": \"58830002.24\",\n" +
                "      \"volume24\": 1468411.5453076223,\n" +
                "      \"volume24a\": 1427871.6117344222,\n" +
                "      \"csupply\": \"46250000000.00\",\n" +
                "      \"tsupply\": \"100000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"43\",\n" +
                "      \"symbol\": \"DGB\",\n" +
                "      \"name\": \"Digibyte\",\n" +
                "      \"nameid\": \"digibyte\",\n" +
                "      \"rank\": 61,\n" +
                "      \"price_usd\": \"0.004438\",\n" +
                "      \"percent_change_24h\": \"-1.12\",\n" +
                "      \"percent_change_1h\": \"-0.69\",\n" +
                "      \"percent_change_7d\": \"21.33\",\n" +
                "      \"price_btc\": \"7.00E-7\",\n" +
                "      \"market_cap_usd\": \"57476612.86\",\n" +
                "      \"volume24\": 700759.3367988678,\n" +
                "      \"volume24a\": 897171.6426742563,\n" +
                "      \"csupply\": \"12950710845.00\",\n" +
                "      \"tsupply\": \"12950710845\",\n" +
                "      \"msupply\": \"21000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2482\",\n" +
                "      \"symbol\": \"BTM\",\n" +
                "      \"name\": \"Bytom\",\n" +
                "      \"nameid\": \"bytom\",\n" +
                "      \"rank\": 62,\n" +
                "      \"price_usd\": \"0.056294\",\n" +
                "      \"percent_change_24h\": \"-2.67\",\n" +
                "      \"percent_change_1h\": \"0.69\",\n" +
                "      \"percent_change_7d\": \"-7.94\",\n" +
                "      \"price_btc\": \"0.000009\",\n" +
                "      \"market_cap_usd\": \"56434227.65\",\n" +
                "      \"volume24\": 141609990.75694406,\n" +
                "      \"volume24a\": 151925734.42034015,\n" +
                "      \"csupply\": \"1002499275.00\",\n" +
                "      \"tsupply\": \"1407000000\",\n" +
                "      \"msupply\": \"1407000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"183\",\n" +
                "      \"symbol\": \"SC\",\n" +
                "      \"name\": \"Siacoin\",\n" +
                "      \"nameid\": \"siacoin\",\n" +
                "      \"rank\": 63,\n" +
                "      \"price_usd\": \"0.001255\",\n" +
                "      \"percent_change_24h\": \"-0.55\",\n" +
                "      \"percent_change_1h\": \"0.18\",\n" +
                "      \"percent_change_7d\": \"-5.46\",\n" +
                "      \"price_btc\": \"1.98E-7\",\n" +
                "      \"market_cap_usd\": \"52459976.50\",\n" +
                "      \"volume24\": 2107591.078858692,\n" +
                "      \"volume24a\": 2381247.3543088003,\n" +
                "      \"csupply\": \"41817047634.00\",\n" +
                "      \"tsupply\": \"41817047634\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32360\",\n" +
                "      \"symbol\": \"THETA\",\n" +
                "      \"name\": \"Theta Token\",\n" +
                "      \"nameid\": \"theta-token\",\n" +
                "      \"rank\": 64,\n" +
                "      \"price_usd\": \"0.072273\",\n" +
                "      \"percent_change_24h\": \"-1.01\",\n" +
                "      \"percent_change_1h\": \"0.24\",\n" +
                "      \"percent_change_7d\": \"4.70\",\n" +
                "      \"price_btc\": \"0.000011\",\n" +
                "      \"market_cap_usd\": \"51060884.16\",\n" +
                "      \"volume24\": 2368265.8337995945,\n" +
                "      \"volume24a\": 2043970.3475873475,\n" +
                "      \"csupply\": \"706502689.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"111\",\n" +
                "      \"symbol\": \"DGD\",\n" +
                "      \"name\": \"DigixDAO\",\n" +
                "      \"nameid\": \"digixdao\",\n" +
                "      \"rank\": 65,\n" +
                "      \"price_usd\": \"25.20\",\n" +
                "      \"percent_change_24h\": \"-2.28\",\n" +
                "      \"percent_change_1h\": \"0.11\",\n" +
                "      \"percent_change_7d\": \"-5.86\",\n" +
                "      \"price_btc\": \"0.003974\",\n" +
                "      \"market_cap_usd\": \"50391994.53\",\n" +
                "      \"volume24\": 942224.8780866403,\n" +
                "      \"volume24a\": 963168.3797756642,\n" +
                "      \"csupply\": \"2000000.00\",\n" +
                "      \"tsupply\": \"2000000\",\n" +
                "      \"msupply\": \"2000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"106\",\n" +
                "      \"symbol\": \"STEEM\",\n" +
                "      \"name\": \"STEEM\",\n" +
                "      \"nameid\": \"steem\",\n" +
                "      \"rank\": 66,\n" +
                "      \"price_usd\": \"0.141640\",\n" +
                "      \"percent_change_24h\": \"-0.46\",\n" +
                "      \"percent_change_1h\": \"-0.93\",\n" +
                "      \"percent_change_7d\": \"-24.80\",\n" +
                "      \"price_btc\": \"0.000022\",\n" +
                "      \"market_cap_usd\": \"48491303.78\",\n" +
                "      \"volume24\": 1289816.627368903,\n" +
                "      \"volume24a\": 1564280.0239598423,\n" +
                "      \"csupply\": \"342356149.00\",\n" +
                "      \"tsupply\": \"342356149\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33085\",\n" +
                "      \"symbol\": \"QNT\",\n" +
                "      \"name\": \"Quant\",\n" +
                "      \"nameid\": \"quant\",\n" +
                "      \"rank\": 67,\n" +
                "      \"price_usd\": \"3.94\",\n" +
                "      \"percent_change_24h\": \"1.26\",\n" +
                "      \"percent_change_1h\": \"0.10\",\n" +
                "      \"percent_change_7d\": \"54.32\",\n" +
                "      \"price_btc\": \"0.000622\",\n" +
                "      \"market_cap_usd\": \"47589556.11\",\n" +
                "      \"volume24\": 3506089.742492819,\n" +
                "      \"volume24a\": 3243681.7763113673,\n" +
                "      \"csupply\": \"12072738.00\",\n" +
                "      \"tsupply\": \"45467000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33391\",\n" +
                "      \"symbol\": \"BTT\",\n" +
                "      \"name\": \"BitTorrent\",\n" +
                "      \"nameid\": \"bittorrent\",\n" +
                "      \"rank\": 68,\n" +
                "      \"price_usd\": \"0.000220\",\n" +
                "      \"percent_change_24h\": \"-0.58\",\n" +
                "      \"percent_change_1h\": \"0.17\",\n" +
                "      \"percent_change_7d\": \"-0.41\",\n" +
                "      \"price_btc\": \"3.47E-8\",\n" +
                "      \"market_cap_usd\": \"46622036.36\",\n" +
                "      \"volume24\": 3858458.978179876,\n" +
                "      \"volume24a\": 4413118.5373356985,\n" +
                "      \"csupply\": \"212116500000.00\",\n" +
                "      \"tsupply\": \"990000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"54\",\n" +
                "      \"symbol\": \"BTS\",\n" +
                "      \"name\": \"BitShares\",\n" +
                "      \"nameid\": \"bitshares\",\n" +
                "      \"rank\": 69,\n" +
                "      \"price_usd\": \"0.016034\",\n" +
                "      \"percent_change_24h\": \"-1.35\",\n" +
                "      \"percent_change_1h\": \"0.23\",\n" +
                "      \"percent_change_7d\": \"-6.78\",\n" +
                "      \"price_btc\": \"0.000003\",\n" +
                "      \"market_cap_usd\": \"43947101.81\",\n" +
                "      \"volume24\": 2132176.0682627372,\n" +
                "      \"volume24a\": 2985749.256169867,\n" +
                "      \"csupply\": \"2740910000.00\",\n" +
                "      \"tsupply\": \"2740910000\",\n" +
                "      \"msupply\": \"3600570502\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32686\",\n" +
                "      \"symbol\": \"HOT\",\n" +
                "      \"name\": \"Holo\",\n" +
                "      \"nameid\": \"holo\",\n" +
                "      \"rank\": 70,\n" +
                "      \"price_usd\": \"0.000323\",\n" +
                "      \"percent_change_24h\": \"-4.34\",\n" +
                "      \"percent_change_1h\": \"-1.89\",\n" +
                "      \"percent_change_7d\": \"-3.26\",\n" +
                "      \"price_btc\": \"5.10E-8\",\n" +
                "      \"market_cap_usd\": \"43040591.44\",\n" +
                "      \"volume24\": 2908715.25874237,\n" +
                "      \"volume24a\": 3080504.8773753047,\n" +
                "      \"csupply\": \"133214575156.00\",\n" +
                "      \"tsupply\": \"177619433541\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33228\",\n" +
                "      \"symbol\": \"HC\",\n" +
                "      \"name\": \"HyperCash\",\n" +
                "      \"nameid\": \"hypercash\",\n" +
                "      \"rank\": 71,\n" +
                "      \"price_usd\": \"0.951336\",\n" +
                "      \"percent_change_24h\": \"-3.28\",\n" +
                "      \"percent_change_1h\": \"0.06\",\n" +
                "      \"percent_change_7d\": \"-7.22\",\n" +
                "      \"price_btc\": \"0.000150\",\n" +
                "      \"market_cap_usd\": \"41411435.30\",\n" +
                "      \"volume24\": 441490.89328656945,\n" +
                "      \"volume24a\": 727869.9358680727,\n" +
                "      \"csupply\": \"43529781.00\",\n" +
                "      \"tsupply\": \"43529781\",\n" +
                "      \"msupply\": \"84000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"139\",\n" +
                "      \"symbol\": \"KMD\",\n" +
                "      \"name\": \"Komodo\",\n" +
                "      \"nameid\": \"komodo\",\n" +
                "      \"rank\": 72,\n" +
                "      \"price_usd\": \"0.355932\",\n" +
                "      \"percent_change_24h\": \"-1.02\",\n" +
                "      \"percent_change_1h\": \"0.24\",\n" +
                "      \"percent_change_7d\": \"-8.12\",\n" +
                "      \"price_btc\": \"0.000056\",\n" +
                "      \"market_cap_usd\": \"41160819.86\",\n" +
                "      \"volume24\": 1464334.968366998,\n" +
                "      \"volume24a\": 1497965.6213473934,\n" +
                "      \"csupply\": \"115642437.00\",\n" +
                "      \"tsupply\": \"115642437\",\n" +
                "      \"msupply\": \"200000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"186\",\n" +
                "      \"symbol\": \"ZEN\",\n" +
                "      \"name\": \"Horizen\",\n" +
                "      \"nameid\": \"zencash\",\n" +
                "      \"rank\": 73,\n" +
                "      \"price_usd\": \"5.55\",\n" +
                "      \"percent_change_24h\": \"-3.73\",\n" +
                "      \"percent_change_1h\": \"0.80\",\n" +
                "      \"percent_change_7d\": \"1.72\",\n" +
                "      \"price_btc\": \"0.000875\",\n" +
                "      \"market_cap_usd\": \"39851892.04\",\n" +
                "      \"volume24\": 1534106.9597342142,\n" +
                "      \"volume24a\": 1581456.8895320795,\n" +
                "      \"csupply\": \"7185725.00\",\n" +
                "      \"tsupply\": \"7185725\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"34406\",\n" +
                "      \"symbol\": \"ALGO\",\n" +
                "      \"name\": \"Algorand\",\n" +
                "      \"nameid\": \"algorand\",\n" +
                "      \"rank\": 74,\n" +
                "      \"price_usd\": \"0.152237\",\n" +
                "      \"percent_change_24h\": \"-2.62\",\n" +
                "      \"percent_change_1h\": \"-0.02\",\n" +
                "      \"percent_change_7d\": \"-3.93\",\n" +
                "      \"price_btc\": \"0.000024\",\n" +
                "      \"market_cap_usd\": \"39468503.32\",\n" +
                "      \"volume24\": 40242410.689191215,\n" +
                "      \"volume24a\": 38182258.673436165,\n" +
                "      \"csupply\": \"259256762.00\",\n" +
                "      \"tsupply\": \"2588969743\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33535\",\n" +
                "      \"symbol\": \"VSYS\",\n" +
                "      \"name\": \"V Systems\",\n" +
                "      \"nameid\": \"v-systems\",\n" +
                "      \"rank\": 75,\n" +
                "      \"price_usd\": \"0.021978\",\n" +
                "      \"percent_change_24h\": \"-0.46\",\n" +
                "      \"percent_change_1h\": \"0.81\",\n" +
                "      \"percent_change_7d\": \"-10.53\",\n" +
                "      \"price_btc\": \"0.000003\",\n" +
                "      \"market_cap_usd\": \"39313950.45\",\n" +
                "      \"volume24\": 3378658.693473846,\n" +
                "      \"volume24a\": 4289846.293645686,\n" +
                "      \"csupply\": \"1788818695.00\",\n" +
                "      \"tsupply\": \"5217805440\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"102\",\n" +
                "      \"symbol\": \"XVG\",\n" +
                "      \"name\": \"Verge\",\n" +
                "      \"nameid\": \"verge\",\n" +
                "      \"rank\": 76,\n" +
                "      \"price_usd\": \"0.002430\",\n" +
                "      \"percent_change_24h\": \"-2.40\",\n" +
                "      \"percent_change_1h\": \"-0.21\",\n" +
                "      \"percent_change_7d\": \"-1.00\",\n" +
                "      \"price_btc\": \"3.83E-7\",\n" +
                "      \"market_cap_usd\": \"38636454.95\",\n" +
                "      \"volume24\": 662004.1353631776,\n" +
                "      \"volume24a\": 1154692.6137260518,\n" +
                "      \"csupply\": \"15900663549.00\",\n" +
                "      \"tsupply\": \"15900663549\",\n" +
                "      \"msupply\": \"16555000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33529\",\n" +
                "      \"symbol\": \"ZB\",\n" +
                "      \"name\": \"ZB\",\n" +
                "      \"nameid\": \"zb\",\n" +
                "      \"rank\": 77,\n" +
                "      \"price_usd\": \"0.224111\",\n" +
                "      \"percent_change_24h\": \"-0.66\",\n" +
                "      \"percent_change_1h\": \"0.72\",\n" +
                "      \"percent_change_7d\": \"-3.86\",\n" +
                "      \"price_btc\": \"0.000035\",\n" +
                "      \"market_cap_usd\": \"36574692.18\",\n" +
                "      \"volume24\": 33587856.57288166,\n" +
                "      \"volume24a\": 33822650.81542021,\n" +
                "      \"csupply\": \"163198810.00\",\n" +
                "      \"tsupply\": \"2100000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32229\",\n" +
                "      \"symbol\": \"IOST\",\n" +
                "      \"name\": \"IOStoken\",\n" +
                "      \"nameid\": \"iostoken\",\n" +
                "      \"rank\": 78,\n" +
                "      \"price_usd\": \"0.002991\",\n" +
                "      \"percent_change_24h\": \"-0.50\",\n" +
                "      \"percent_change_1h\": \"-0.03\",\n" +
                "      \"percent_change_7d\": \"-8.72\",\n" +
                "      \"price_btc\": \"4.72E-7\",\n" +
                "      \"market_cap_usd\": \"35929675.20\",\n" +
                "      \"volume24\": 25211960.54761372,\n" +
                "      \"volume24a\": 22378391.609301824,\n" +
                "      \"csupply\": \"12013965609.00\",\n" +
                "      \"tsupply\": \"21000000000\",\n" +
                "      \"msupply\": \"21000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32764\",\n" +
                "      \"symbol\": \"SEELE\",\n" +
                "      \"name\": \"Seele\",\n" +
                "      \"nameid\": \"seele\",\n" +
                "      \"rank\": 79,\n" +
                "      \"price_usd\": \"0.048268\",\n" +
                "      \"percent_change_24h\": \"-0.72\",\n" +
                "      \"percent_change_1h\": \"-0.02\",\n" +
                "      \"percent_change_7d\": \"-6.74\",\n" +
                "      \"price_btc\": \"0.000008\",\n" +
                "      \"market_cap_usd\": \"33438811.20\",\n" +
                "      \"volume24\": 11614573.782512922,\n" +
                "      \"volume24a\": 11652666.620252829,\n" +
                "      \"csupply\": \"692776387.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32334\",\n" +
                "      \"symbol\": \"ZIL\",\n" +
                "      \"name\": \"Zilliqa\",\n" +
                "      \"nameid\": \"zilliqa\",\n" +
                "      \"rank\": 80,\n" +
                "      \"price_usd\": \"0.003788\",\n" +
                "      \"percent_change_24h\": \"-1.29\",\n" +
                "      \"percent_change_1h\": \"0.42\",\n" +
                "      \"percent_change_7d\": \"-3.51\",\n" +
                "      \"price_btc\": \"5.97E-7\",\n" +
                "      \"market_cap_usd\": \"32904340.22\",\n" +
                "      \"volume24\": 5586046.248100076,\n" +
                "      \"volume24a\": 6702346.171013796,\n" +
                "      \"csupply\": \"8687360058.00\",\n" +
                "      \"tsupply\": \"12600000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"131\",\n" +
                "      \"symbol\": \"ARDR\",\n" +
                "      \"name\": \"Ardor\",\n" +
                "      \"nameid\": \"ardor\",\n" +
                "      \"rank\": 81,\n" +
                "      \"price_usd\": \"0.032420\",\n" +
                "      \"percent_change_24h\": \"-2.17\",\n" +
                "      \"percent_change_1h\": \"0.05\",\n" +
                "      \"percent_change_7d\": \"-4.36\",\n" +
                "      \"price_btc\": \"0.000005\",\n" +
                "      \"market_cap_usd\": \"32387861.32\",\n" +
                "      \"volume24\": 515873.3404241307,\n" +
                "      \"volume24a\": 585638.2264236253,\n" +
                "      \"csupply\": \"998999495.00\",\n" +
                "      \"tsupply\": \"998999495\",\n" +
                "      \"msupply\": \"998999495\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"156\",\n" +
                "      \"symbol\": \"GNT\",\n" +
                "      \"name\": \"Golem\",\n" +
                "      \"nameid\": \"golem-network-tokens\",\n" +
                "      \"rank\": 82,\n" +
                "      \"price_usd\": \"0.033197\",\n" +
                "      \"percent_change_24h\": \"-2.15\",\n" +
                "      \"percent_change_1h\": \"0.17\",\n" +
                "      \"percent_change_7d\": \"-4.12\",\n" +
                "      \"price_btc\": \"0.000005\",\n" +
                "      \"market_cap_usd\": \"32017108.25\",\n" +
                "      \"volume24\": 2411337.320930726,\n" +
                "      \"volume24a\": 2373042.333431777,\n" +
                "      \"csupply\": \"964450000.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2732\",\n" +
                "      \"symbol\": \"GXS\",\n" +
                "      \"name\": \"GXChain\",\n" +
                "      \"nameid\": \"gxchain\",\n" +
                "      \"rank\": 83,\n" +
                "      \"price_usd\": \"0.451617\",\n" +
                "      \"percent_change_24h\": \"9.25\",\n" +
                "      \"percent_change_1h\": \"2.08\",\n" +
                "      \"percent_change_7d\": \"-0.06\",\n" +
                "      \"price_btc\": \"0.000071\",\n" +
                "      \"market_cap_usd\": \"29355122.46\",\n" +
                "      \"volume24\": 1338362.4129331284,\n" +
                "      \"volume24a\": 266253.21821432974,\n" +
                "      \"csupply\": \"65000000.00\",\n" +
                "      \"tsupply\": \"100000000\",\n" +
                "      \"msupply\": \"100000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32226\",\n" +
                "      \"symbol\": \"ELF\",\n" +
                "      \"name\": \"aelf\",\n" +
                "      \"nameid\": \"aelf\",\n" +
                "      \"rank\": 84,\n" +
                "      \"price_usd\": \"0.058545\",\n" +
                "      \"percent_change_24h\": \"-6.83\",\n" +
                "      \"percent_change_1h\": \"0.08\",\n" +
                "      \"percent_change_7d\": \"2.41\",\n" +
                "      \"price_btc\": \"0.000009\",\n" +
                "      \"market_cap_usd\": \"29259609.46\",\n" +
                "      \"volume24\": 31458436.434000973,\n" +
                "      \"volume24a\": 40997255.15587724,\n" +
                "      \"csupply\": \"499780000.00\",\n" +
                "      \"tsupply\": \"499780000\",\n" +
                "      \"msupply\": \"1000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2765\",\n" +
                "      \"symbol\": \"DATA\",\n" +
                "      \"name\": \"Streamr DATAcoin\",\n" +
                "      \"nameid\": \"streamr-datacoin\",\n" +
                "      \"rank\": 85,\n" +
                "      \"price_usd\": \"0.042099\",\n" +
                "      \"percent_change_24h\": \"-10.28\",\n" +
                "      \"percent_change_1h\": \"-0.54\",\n" +
                "      \"percent_change_7d\": \"32.18\",\n" +
                "      \"price_btc\": \"0.000007\",\n" +
                "      \"market_cap_usd\": \"28507430.00\",\n" +
                "      \"volume24\": 2945883.699798246,\n" +
                "      \"volume24a\": 6397277.44441529,\n" +
                "      \"csupply\": \"677154514.00\",\n" +
                "      \"tsupply\": \"987154514\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32238\",\n" +
                "      \"symbol\": \"WAX\",\n" +
                "      \"name\": \"WAX\",\n" +
                "      \"nameid\": \"wax\",\n" +
                "      \"rank\": 86,\n" +
                "      \"price_usd\": \"0.029225\",\n" +
                "      \"percent_change_24h\": \"-1.50\",\n" +
                "      \"percent_change_1h\": \"0.37\",\n" +
                "      \"percent_change_7d\": \"-7.63\",\n" +
                "      \"price_btc\": \"0.000005\",\n" +
                "      \"market_cap_usd\": \"27553670.76\",\n" +
                "      \"volume24\": 100052.99204895827,\n" +
                "      \"volume24a\": 100423.24743007474,\n" +
                "      \"csupply\": \"942821662.00\",\n" +
                "      \"tsupply\": \"1850000000\",\n" +
                "      \"msupply\": \"1850000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32390\",\n" +
                "      \"symbol\": \"REN\",\n" +
                "      \"name\": \"Republic Protocol\",\n" +
                "      \"nameid\": \"republic-protocol\",\n" +
                "      \"rank\": 87,\n" +
                "      \"price_usd\": \"0.046181\",\n" +
                "      \"percent_change_24h\": \"4.48\",\n" +
                "      \"percent_change_1h\": \"0.51\",\n" +
                "      \"percent_change_7d\": \"11.78\",\n" +
                "      \"price_btc\": \"0.000007\",\n" +
                "      \"market_cap_usd\": \"27166417.85\",\n" +
                "      \"volume24\": 1297141.4417736793,\n" +
                "      \"volume24a\": 772289.9786524973,\n" +
                "      \"csupply\": \"588261205.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2731\",\n" +
                "      \"symbol\": \"AE\",\n" +
                "      \"name\": \"Aeternity\",\n" +
                "      \"nameid\": \"aeternity\",\n" +
                "      \"rank\": 88,\n" +
                "      \"price_usd\": \"0.096030\",\n" +
                "      \"percent_change_24h\": \"-1.66\",\n" +
                "      \"percent_change_1h\": \"0.38\",\n" +
                "      \"percent_change_7d\": \"-4.92\",\n" +
                "      \"price_btc\": \"0.000015\",\n" +
                "      \"market_cap_usd\": \"26920298.28\",\n" +
                "      \"volume24\": 7871213.486972998,\n" +
                "      \"volume24a\": 8771242.293446552,\n" +
                "      \"csupply\": \"280333087.00\",\n" +
                "      \"tsupply\": \"280333087\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"258\",\n" +
                "      \"symbol\": \"MANA\",\n" +
                "      \"name\": \"Decentraland\",\n" +
                "      \"nameid\": \"decentraland\",\n" +
                "      \"rank\": 89,\n" +
                "      \"price_usd\": \"0.025507\",\n" +
                "      \"percent_change_24h\": \"0.25\",\n" +
                "      \"percent_change_1h\": \"-0.07\",\n" +
                "      \"percent_change_7d\": \"-4.60\",\n" +
                "      \"price_btc\": \"0.000004\",\n" +
                "      \"market_cap_usd\": \"26786285.05\",\n" +
                "      \"volume24\": 19362054.228040207,\n" +
                "      \"volume24a\": 21022551.169693023,\n" +
                "      \"csupply\": \"1050141509.00\",\n" +
                "      \"tsupply\": \"2644403343\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33548\",\n" +
                "      \"symbol\": \"NEX\",\n" +
                "      \"name\": \"Nash Exchange\",\n" +
                "      \"nameid\": \"nash-exchange\",\n" +
                "      \"rank\": 90,\n" +
                "      \"price_usd\": \"0.732881\",\n" +
                "      \"percent_change_24h\": \"-6.37\",\n" +
                "      \"percent_change_1h\": \"0.95\",\n" +
                "      \"percent_change_7d\": \"12.35\",\n" +
                "      \"price_btc\": \"0.000116\",\n" +
                "      \"market_cap_usd\": \"26527848.63\",\n" +
                "      \"volume24\": 3034022.708768712,\n" +
                "      \"volume24a\": 3619341.782185696,\n" +
                "      \"csupply\": \"36196678.00\",\n" +
                "      \"tsupply\": \"56296100\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32342\",\n" +
                "      \"symbol\": \"NPXS\",\n" +
                "      \"name\": \"Pundi X\",\n" +
                "      \"nameid\": \"pundi-x\",\n" +
                "      \"rank\": 91,\n" +
                "      \"price_usd\": \"0.000109\",\n" +
                "      \"percent_change_24h\": \"-1.80\",\n" +
                "      \"percent_change_1h\": \"0.26\",\n" +
                "      \"percent_change_7d\": \"-3.18\",\n" +
                "      \"price_btc\": \"1.73E-8\",\n" +
                "      \"market_cap_usd\": \"25750146.79\",\n" +
                "      \"volume24\": 600514.612136173,\n" +
                "      \"volume24a\": 704916.2240693109,\n" +
                "      \"csupply\": \"235171468515.00\",\n" +
                "      \"tsupply\": \"280255193861\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"120\",\n" +
                "      \"symbol\": \"STRAT\",\n" +
                "      \"name\": \"Stratis\",\n" +
                "      \"nameid\": \"stratis\",\n" +
                "      \"rank\": 92,\n" +
                "      \"price_usd\": \"0.256403\",\n" +
                "      \"percent_change_24h\": \"6.77\",\n" +
                "      \"percent_change_1h\": \"-3.61\",\n" +
                "      \"percent_change_7d\": \"-0.30\",\n" +
                "      \"price_btc\": \"0.000040\",\n" +
                "      \"market_cap_usd\": \"25570802.69\",\n" +
                "      \"volume24\": 1813773.7042291833,\n" +
                "      \"volume24a\": 340706.80672823836,\n" +
                "      \"csupply\": \"99729045.00\",\n" +
                "      \"tsupply\": \"99729045\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32338\",\n" +
                "      \"symbol\": \"WICC\",\n" +
                "      \"name\": \"WaykiChain\",\n" +
                "      \"nameid\": \"waykichain\",\n" +
                "      \"rank\": 93,\n" +
                "      \"price_usd\": \"0.135002\",\n" +
                "      \"percent_change_24h\": \"-3.65\",\n" +
                "      \"percent_change_1h\": \"0.26\",\n" +
                "      \"percent_change_7d\": \"-11.49\",\n" +
                "      \"price_btc\": \"0.000021\",\n" +
                "      \"market_cap_usd\": \"25515321.41\",\n" +
                "      \"volume24\": 616641.6662687032,\n" +
                "      \"volume24a\": 722783.2144839135,\n" +
                "      \"csupply\": \"189000000.00\",\n" +
                "      \"tsupply\": \"210000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"264\",\n" +
                "      \"symbol\": \"RCN\",\n" +
                "      \"name\": \"Ripio Credit Network\",\n" +
                "      \"nameid\": \"ripiocreditnetwork\",\n" +
                "      \"rank\": 94,\n" +
                "      \"price_usd\": \"0.051148\",\n" +
                "      \"percent_change_24h\": \"4.95\",\n" +
                "      \"percent_change_1h\": \"0.20\",\n" +
                "      \"percent_change_7d\": \"15.76\",\n" +
                "      \"price_btc\": \"0.000008\",\n" +
                "      \"market_cap_usd\": \"25232828.01\",\n" +
                "      \"volume24\": 361589.62632973853,\n" +
                "      \"volume24a\": 366119.2131587802,\n" +
                "      \"csupply\": \"493330791.00\",\n" +
                "      \"tsupply\": \"999942647\",\n" +
                "      \"msupply\": \"1000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"36419\",\n" +
                "      \"symbol\": \"CVCC\",\n" +
                "      \"name\": \"CryptoVerificationCoin\",\n" +
                "      \"nameid\": \"cryptoverificationcoin\",\n" +
                "      \"rank\": 95,\n" +
                "      \"price_usd\": \"21.57\",\n" +
                "      \"percent_change_24h\": \"-2.35\",\n" +
                "      \"percent_change_1h\": \"0.15\",\n" +
                "      \"percent_change_7d\": \"-6.32\",\n" +
                "      \"price_btc\": \"0.003402\",\n" +
                "      \"market_cap_usd\": \"24864537.35\",\n" +
                "      \"volume24\": 54850.36508040003,\n" +
                "      \"volume24a\": 52767.59954296782,\n" +
                "      \"csupply\": \"1152727.00\",\n" +
                "      \"tsupply\": \"1152727\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"166\",\n" +
                "      \"symbol\": \"RLC\",\n" +
                "      \"name\": \"iExec RLC\",\n" +
                "      \"nameid\": \"rlc\",\n" +
                "      \"rank\": 96,\n" +
                "      \"price_usd\": \"0.296571\",\n" +
                "      \"percent_change_24h\": \"-1.02\",\n" +
                "      \"percent_change_1h\": \"0.20\",\n" +
                "      \"percent_change_7d\": \"-2.09\",\n" +
                "      \"price_btc\": \"0.000047\",\n" +
                "      \"market_cap_usd\": \"23746703.18\",\n" +
                "      \"volume24\": 228091.0066415679,\n" +
                "      \"volume24a\": 417060.3804830879,\n" +
                "      \"csupply\": \"80070793.00\",\n" +
                "      \"tsupply\": \"86999785\",\n" +
                "      \"msupply\": \" 87000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33536\",\n" +
                "      \"symbol\": \"MATIC\",\n" +
                "      \"name\": \"Matic Network\",\n" +
                "      \"nameid\": \"matic-network\",\n" +
                "      \"rank\": 97,\n" +
                "      \"price_usd\": \"0.010871\",\n" +
                "      \"percent_change_24h\": \"0.57\",\n" +
                "      \"percent_change_1h\": \"0.42\",\n" +
                "      \"percent_change_7d\": \"-5.05\",\n" +
                "      \"price_btc\": \"0.000002\",\n" +
                "      \"market_cap_usd\": \"23647003.76\",\n" +
                "      \"volume24\": 8049181.610772796,\n" +
                "      \"volume24a\": 8726487.488244751,\n" +
                "      \"csupply\": \"2175190262.00\",\n" +
                "      \"tsupply\": \"10000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2781\",\n" +
                "      \"symbol\": \"LRC\",\n" +
                "      \"name\": \"Loopring\",\n" +
                "      \"nameid\": \"loopring\",\n" +
                "      \"rank\": 98,\n" +
                "      \"price_usd\": \"0.026188\",\n" +
                "      \"percent_change_24h\": \"-1.46\",\n" +
                "      \"percent_change_1h\": \"0.25\",\n" +
                "      \"percent_change_7d\": \"-6.60\",\n" +
                "      \"price_btc\": \"0.000004\",\n" +
                "      \"market_cap_usd\": \"23525225.67\",\n" +
                "      \"volume24\": 2185264.696863431,\n" +
                "      \"volume24a\": 2215851.7265999042,\n" +
                "      \"csupply\": \"898304697.00\",\n" +
                "      \"tsupply\": \"1374956262\",\n" +
                "      \"msupply\": \"1395076055\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33764\",\n" +
                "      \"symbol\": \"RIF\",\n" +
                "      \"name\": \"RIF Token\",\n" +
                "      \"nameid\": \"rif-token\",\n" +
                "      \"rank\": 99,\n" +
                "      \"price_usd\": \"0.049120\",\n" +
                "      \"percent_change_24h\": \"0.67\",\n" +
                "      \"percent_change_1h\": \"-2.24\",\n" +
                "      \"percent_change_7d\": \"0.74\",\n" +
                "      \"price_btc\": \"0.000008\",\n" +
                "      \"market_cap_usd\": \"23478195.84\",\n" +
                "      \"volume24\": 9746789.392298164,\n" +
                "      \"volume24a\": 10113487.53253699,\n" +
                "      \"csupply\": \"477980957.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"95\",\n" +
                "      \"symbol\": \"MAID\",\n" +
                "      \"name\": \"MaidSafeCoin\",\n" +
                "      \"nameid\": \"maidsafecoin\",\n" +
                "      \"rank\": 100,\n" +
                "      \"price_usd\": \"0.051328\",\n" +
                "      \"percent_change_24h\": \"-3.21\",\n" +
                "      \"percent_change_1h\": \"0.10\",\n" +
                "      \"percent_change_7d\": \"-7.40\",\n" +
                "      \"price_btc\": \"0.000008\",\n" +
                "      \"market_cap_usd\": \"23228833.72\",\n" +
                "      \"volume24\": 132184.7600722813,\n" +
                "      \"volume24a\": 130547.15377881246,\n" +
                "      \"csupply\": \"452552412.00\",\n" +
                "      \"tsupply\": \"452552412\",\n" +
                "      \"msupply\": \"\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"info\": {\n" +
                "    \"coins_num\": 3986,\n" +
                "    \"time\": 1585708866\n" +
                "  }\n" +
                "}";

        return coins;
    }
}