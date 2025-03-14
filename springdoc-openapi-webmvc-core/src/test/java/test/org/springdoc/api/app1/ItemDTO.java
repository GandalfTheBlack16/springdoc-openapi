/*
 *
 *  * Copyright 2019-2020 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package test.org.springdoc.api.app1;

import java.io.Serializable;

/**
 * @author bnasslahsen
 */
public class ItemDTO implements Serializable {

	/**
	 * serialVersionUID of type long
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * itemID of type String
	 */
	private String itemID;

	/**
	 * description of type String
	 */
	private String description;

	/**
	 * price of type int
	 */
	private int price;

	@Deprecated
	private int deprecatedPrice;

	/**
	 *
	 */
	public ItemDTO() {
	}

	/**
	 * @param description description
	 * @param price       price
	 */
	public ItemDTO(final String description, final int price) {
		this.description = description;
		this.price = price;
	}

	/**
	 * @param itemID      itemID
	 * @param description description
	 * @param price       price
	 */
	public ItemDTO(final String itemID, final String description, final int price) {
		this.itemID = itemID;
		this.description = description;
		this.price = price;
	}

	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description description
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @return
	 */
	public String getItemID() {
		return itemID;
	}

	/**
	 * @param itemID itemID
	 */
	public void setItemID(final String itemID) {
		this.itemID = itemID;
	}

	/**
	 * @return
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price price
	 */
	public void setPrice(final int price) {
		this.price = price;
	}

	public int getDeprecatedPrice() {
		return deprecatedPrice;
	}

	public void setDeprecatedPrice(int deprecatedPrice) {
		this.deprecatedPrice = deprecatedPrice;
	}
}
