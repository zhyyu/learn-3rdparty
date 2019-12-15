package com.zhyyu.learn.learn3rdparty.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author juror
 * @datatime 2019/12/15 11:48
 */
public class JsonArrayTest {

    /**
     * [{
     * 		"comlist": [{
     * 				"commodityId": 478,
     * 				"goods_id": "Pringles Sour n Cream",
     * 				"originalPrice": 5000.00,
     * 				"proid_id": "pringles-sour-cream",
     * 				"tradingPrice": 5000.00,
     * 				"rewardId": 879
     *                        }, {
     * 				"commodityId": 478,
     * 				"goods_id": "Pringles Sour n Cream",
     * 				"originalPrice": 5000.00,
     * 				"proid_id": "pringles-sour-cream",
     * 				"tradingPrice": 5000.00,
     * 				"rewardId": 879
     *            }
     * 		]
     * 	}
     * ]
     * @param args
     */

    public static void main(String[] args) {
        String jsonArrayStr = "[{\"comlist\":[{\"commodityId\":478,\"goods_id\":\"Pringles Sour n Cream\",\"originalPrice\":5000.00,\"proid_id\":\"pringles-sour-cream\",\"tradingPrice\":5000.00,\"rewardId\":879},{\"commodityId\":478,\"goods_id\":\"Pringles Sour n Cream\",\"originalPrice\":5000.00,\"proid_id\":\"pringles-sour-cream\",\"tradingPrice\":5000.00,\"rewardId\":879}]}]";

        JSONArray jsonArray = JSON.parseArray(jsonArrayStr);
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);

        System.out.println(jsonArray);
        System.out.println(jsonObject);

        JSONArray comlist = jsonObject.getJSONArray("comlist");
        System.out.println(comlist);

        JSONObject commJsonObject = (JSONObject) comlist.get(0);
        System.out.println(commJsonObject);

        System.out.println(commJsonObject.getInteger("rewardId"));
    }

}
