/* Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snaker.engine;

import java.util.Map;

import org.snaker.engine.entity.Order;
import org.snaker.engine.entity.Process;

/**
 * 流程实例业务类
 * @author yuqs
 * @version 1.0
 */
public interface IOrderService {
	/**
	 * 根据流程、操作人员、父流程实例ID创建流程实例
	 * @param process 流程定义对象
	 * @param operator 操作人员ID
	 * @param args 参数列表
	 * @return Order 活动流程实例对象
	 */
	Order createOrder(Process process, String operator, Map<String, Object> args);
	
	/**
	 * 根据流程、操作人员、父流程实例ID创建流程实例
	 * @param process 流程定义对象
	 * @param operator 操作人员ID
	 * @param args 参数列表
	 * @param parentId 父流程实例ID
	 * @param parentNodeName 父流程节点模型
	 * @return 活动流程实例对象
	 */
	Order createOrder(Process process, String operator, Map<String, Object> args, String parentId, String parentNodeName);
	
	/**
	 * 流程实例正常完成
	 * @param orderId 流程实例id
	 */
	void complete(String orderId);
	
	/**
	 * 保存流程实例
	 * @param order 流程实例对象
	 */
	void saveOrder(Order order);
	
	/**
	 * 流程实例强制终止
	 * @param orderId 流程实例id
	 */
	void terminate(String orderId);
	
	/**
	 * 流程实例强制终止
	 * @param orderId 流程实例id
	 * @param operator 处理人员
	 */
	void terminate(String orderId, String operator);
	
	/**
	 * 更新流程实例
	 * @param order 流程实例对象
	 */
	void updateOrder(Order order);
}
