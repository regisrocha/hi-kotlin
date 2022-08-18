package dev.rrlabs.hikotlin.editor.api.resource

import com.fasterxml.jackson.annotation.JsonProperty

data class EditorResource(
    var id: String? = "",
    var alias: String? = "",

    @JsonProperty("appereance_raw_content")
    var appereanceRawContent: String? = "",

    @JsonProperty("links_mp")
    var linksMp: String? = "",

    @JsonProperty("products_shops")
    var productsShops: String? = ""
)
