/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.market_inner.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market_inner.model.v20160801.InnerPrevProduceImageInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerPrevProduceImageInstanceResponseUnmarshaller {

	public static InnerPrevProduceImageInstanceResponse unmarshall(InnerPrevProduceImageInstanceResponse innerPrevProduceImageInstanceResponse, UnmarshallerContext context) {
		

		List<String> instanceIdList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerPrevProduceImageInstanceResponse.InstanceIdList.Length"); i++) {
			instanceIdList.add(context.stringValue("InnerPrevProduceImageInstanceResponse.InstanceIdList["+ i +"]"));
		}
		innerPrevProduceImageInstanceResponse.setInstanceIdList(instanceIdList);
	 
	 	return innerPrevProduceImageInstanceResponse;
	}
}