/*
 * Copyright 2014 Google Inc.
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

package com.selesca.xkcdmuzei;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

interface XkcdService {
    @GET("/{num}/info.0.json")
    Photo getPhoto(
            @Path("num") String num
    );

    static class Photo {
        int num;
        String img;
        String title;
        String alt;
        String year;
        String month;
    }

}
