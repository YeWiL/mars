/*
* Tencent is pleased to support the open source community by making Mars available.
* Copyright (C) 2016 THL A29 Limited, a Tencent company. All rights reserved.
*
* Licensed under the MIT License (the "License"); you may not use this file except in 
* compliance with the License. You may obtain a copy of the License at
* http://opensource.org/licenses/MIT
*
* Unless required by applicable law or agreed to in writing, software distributed under the License is
* distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
* either express or implied. See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.tencent.mars.utils;

/**
 * Created by caoshaokun on 16/12/23.
 */
public class LogUtils {

    public static String format(final String fmt, Object... params) {
        String f;
        if (params != null) {
            f = String.format(fmt, params);
        } else {
            f = fmt;
        }

        return f;
    }

}
