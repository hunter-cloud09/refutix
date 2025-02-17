/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.refutix.refutix.web.server.data.enums;

/** user type. */
public enum UserType {
    /** ldap user. */
    LDAP(1, "LDAP"),
    /** local user. */
    LOCAL(0, "LOCAL");

    private final int code;
    private final String type;

    public int getCode() {
        return this.code;
    }

    public String getType() {
        return this.type;
    }

    UserType(int code, String type) {
        this.code = code;
        this.type = type;
    }
}
