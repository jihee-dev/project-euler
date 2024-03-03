package main.kotlin

/*
* 아래와 같은 2 × 2 격자의 왼쪽 위 모서리에서 출발하여 오른쪽 아래 모서리까지 도달하는 길은 모두 6가지가 있습니다 (거슬러 가지는 않기로 합니다).
* 그러면 20 × 20 격자에는 모두 몇 개의 경로가 있습니까?
*/

fun problem15(): Long {
    val grid = MutableList(21) { row ->
        MutableList(21) { colum ->
            when {
                row == 0 && colum == 0 -> 0L
                row == 0 -> 1L
                colum == 0 -> 1L
                else -> 0L
            }
        }
    }

    for (i in 1..20) {
        for (j in 1..20) {
            grid[i][j] = grid[i - 1][j] + grid[i][j - 1]
        }
    }

    return grid[20][20] // 137846528820
}
