package dev.rrlabs.hikotlin.downstream.appearance

import org.springframework.stereotype.Service

@Service
class AppereanceGateway {

    fun searchAppereanceData(id: String): String =
        "[{\n" +
        "    \"id\": \"remote-1\",\n" +
        "    \"component\": \"Remote\",\n" +
        "    \"name\": \"Link\",\n" +
        "    \"properties\": {\n" +
        "        ...\n" +
        "    },\n" +
        "    \"children\": [],\n" +
        "    \"hidden\": false\n" +
        "}]"

}