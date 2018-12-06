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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeUpPeakPublishStreamDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUpPeakPublishStreamDataResponseUnmarshaller {

	public static DescribeUpPeakPublishStreamDataResponse unmarshall(DescribeUpPeakPublishStreamDataResponse describeUpPeakPublishStreamDataResponse, UnmarshallerContext context) {
		
		describeUpPeakPublishStreamDataResponse.setRequestId(context.stringValue("DescribeUpPeakPublishStreamDataResponse.RequestId"));

		List<DescribeUpPeakPublishStreamData> describeUpPeakPublishStreamDatas = new ArrayList<DescribeUpPeakPublishStreamData>();
		for (int i = 0; i < context.lengthValue("DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamDatas.Length"); i++) {
			DescribeUpPeakPublishStreamData describeUpPeakPublishStreamData = new DescribeUpPeakPublishStreamData();
			describeUpPeakPublishStreamData.setPublishStreamNum(context.integerValue("DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamDatas["+ i +"].PublishStreamNum"));
			describeUpPeakPublishStreamData.setPeakTime(context.stringValue("DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamDatas["+ i +"].PeakTime"));
			describeUpPeakPublishStreamData.setQueryTime(context.stringValue("DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamDatas["+ i +"].QueryTime"));
			describeUpPeakPublishStreamData.setStatName(context.stringValue("DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamDatas["+ i +"].StatName"));
			describeUpPeakPublishStreamData.setBandWidth(context.stringValue("DescribeUpPeakPublishStreamDataResponse.DescribeUpPeakPublishStreamDatas["+ i +"].BandWidth"));

			describeUpPeakPublishStreamDatas.add(describeUpPeakPublishStreamData);
		}
		describeUpPeakPublishStreamDataResponse.setDescribeUpPeakPublishStreamDatas(describeUpPeakPublishStreamDatas);
	 
	 	return describeUpPeakPublishStreamDataResponse;
	}
}