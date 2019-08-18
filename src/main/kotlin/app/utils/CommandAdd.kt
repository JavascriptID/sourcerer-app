// Copyright 2017 Sourcerer Inc. All Rights Reserved.
// Author: Anatoly Kislov (anatoly@sourcerer.io)

package app.utils

import com.beust.jcommander.Parameter
import com.beust.jcommander.Parameters

@Parameters(separators = "=",
            commandDescription = "Add a repository to tracking list")
class CommandAdd {
    // Command name for CLI.
    val name = "add"

    // Path to analyzed repository.
    @Parameter(description = "REPOPATH")
    var paths: List<String> = arrayListOf()

    // Hash commits of all contributors.
    @Parameter(names = arrayOf("-a", "--all"),
               description = "Hash commits of all contributors.")
    var hashAll: Boolean = false
}
