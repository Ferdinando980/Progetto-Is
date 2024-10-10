const apiUrl = 'http://localhost:8080/players'; 

function addPlayer() {
    const name = document.getElementById('playerName').value;
    const maxScore = document.getElementById('playerMaxScore').value;

    if (name && maxScore) {
        fetch(`${apiUrl}/add`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({
                name: name,
                maxScore: parseInt(maxScore),
            }),
        })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
            document.getElementById('playerName').value = '';
            document.getElementById('playerMaxScore').value = '';
            getPlayers(); // Ricarica la lista dei giocatori
        })
        .catch((error) => {
            console.error('Error:', error);
        });
    } else {
        alert('Compila tutti i campi!');
    }
}

// Funzione per ottenere la lista dei giocatori
function getPlayers() {
    fetch(`${apiUrl}/all`)
        .then(response => response.json())
        .then(data => {
            const playerList = document.getElementById('playerList');
            playerList.innerHTML = ''; // Pulisci la lista esistente
            data.forEach(player => {
                const li = document.createElement('li');
                li.textContent = `${player.name} - Punteggio Massimo: ${player.maxScore}`;
                playerList.appendChild(li);
            });
        })
        .catch((error) => {
            console.error('Error:', error);
        });
}

// Carica i giocatori all'avvio
getPlayers();
