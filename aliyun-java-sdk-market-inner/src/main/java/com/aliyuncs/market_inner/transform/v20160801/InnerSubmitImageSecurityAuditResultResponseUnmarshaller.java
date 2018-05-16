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

import com.aliyuncs.market_inner.model.v20160801.InnerSubmitImageSecurityAuditResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerSubmitImageSecurityAuditResultResponseUnmarshaller {

	public static InnerSubmitImageSecurityAuditResultResponse unmarshall(InnerSubmitImageSecurityAuditResultResponse innerSubmitImageSecurityAuditResultResponse, UnmarshallerContext context) {
		
		innerSubmitImageSecurityAuditResultResponse.setRequestId(context.stringValue("InnerSubmitImageSecurityAuditResultResponse.RequestId"));
		innerSubmitImageSecurityAuditResultResponse.setSuccess(context.booleanValue("InnerSubmitImageSecurityAuditResultResponse.Success"));
	 
	 	return innerSubmitImageSecurityAuditResultResponse;
	}
}