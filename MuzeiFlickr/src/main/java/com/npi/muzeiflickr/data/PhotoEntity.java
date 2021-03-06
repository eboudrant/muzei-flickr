package com.npi.muzeiflickr.data;

import com.npi.muzeiflickr.network.FlickrService;

/*
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
 *
 *
 * Created by nicolas on 14/02/14.
 * Describes a Photo to be stored in the cache system.
 */
public class PhotoEntity {

    public String id;

    public String title;
    public String userName;
    public String url;
    public String source;

    public PhotoEntity(FlickrService.Photo photo) {
        id = photo.id;
        title = photo.title;
    }
}
