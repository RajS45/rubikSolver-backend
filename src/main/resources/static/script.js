const BASE_URL = "http://localhost:8080/cube";

function scramble() {
    const stepsInput = document.getElementById("steps");
    const output = document.getElementById("output");

    if (!stepsInput || !output) {
        console.error("HTML elements not found");
        return;
    }

    output.textContent = "Scrambling...";

    fetch(`${BASE_URL}/scramble`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            steps: parseInt(stepsInput.value)
        })
    })
    .then(res => res.json())
    .then(data => {
        console.log("Scramble response:", data);

        document.getElementById("cubeState").value = data.cubeState;
        output.textContent =
            "Cube State: " + data.cubeState + "\n" +
            "Moves: " + data.moves.join(" ") + "\n" +
            "Solved: " + data.solved;
    })
    .catch(err => {
        console.error(err);
        output.textContent = "Error occurred. Check console.";
    });
}

function solve() {
    const cubeStateInput = document.getElementById("cubeState");
    const output = document.getElementById("output");

    if (!cubeStateInput || !output) {
        console.error("HTML elements not found");
        return;
    }

    output.textContent = "Solving...";

    fetch(`${BASE_URL}/solve`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            cubeState: cubeStateInput.value
        })
    })
    .then(res => res.json())
    .then(data => {
        console.log("Solve response:", data);

        output.textContent =
            "Cube State: " + data.cubeState + "\n" +
            "Moves: " + data.moves.join(" ") + "\n" +
            "Solved: " + data.solved;
    })
    .catch(err => {
        console.error(err);
        output.textContent = "Error occurred. Check console.";
    });
}