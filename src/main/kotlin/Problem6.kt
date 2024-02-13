package main.kotlin

/*
* 1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합).
* 1^2 + 2^2 + ... + 10^2 = 385
*
* 1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다 (합의 제곱).
* (1 + 2 + ... + 10)^2 = 55^2 = 3025
*
* 따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다.
* 그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?
*/

fun problem6(): Int {
    var sumOfSquare = 0
    var squareOfSum = 0

    for (i in 1..100) {
        sumOfSquare += i * i
        squareOfSum += i
    }
    squareOfSum *= squareOfSum

    return squareOfSum - sumOfSquare // 25164150
}

/*
* 시간 복잡도 O(N)
* 공간 복잡도 O(1)
*/

fun problem6_1(): Int {
    val n = 100
    return n * (n - 1) * (n + 1) * (3 * n + 2) / 12
}

/*
* 시간 복잡도 O(1)
* 공간 복잡도 O(1)
*
* 1 + 2 + ... + n = (n * (n - 1)) / 2
* 1^2 + 2^2 + ... + n^2 = (n * (n + 1) * (2 * n + 1)) / 6
*/
