// src\components\ListaDeUsuarios\index.js

import { useState, useEffect } from "react";
import axios from "axios";
import './styles.css';

function ListaDeUsuarios() {
  const [jogadores, setJogadores] = useState([]);

  useEffect(() => {
    const carregarJogadores = async () => {
      try {
        const response = await axios.get('http://localhost:8080/usuarios');
        setJogadores(response.data);
      } catch (error) {
        alert('Erro ao buscar jogadores: ' + error.message);
        setJogadores([]);
      }
    };
    carregarJogadores();
  }, []);

  return (
    <ul className="lista-usuarios">
      {jogadores.length === 0 ? (
        <li>Nenhum jogador encontrado.</li>
      ) : (
        jogadores.map(jogador => (
          <li key={jogador.id}>
            <strong>Nome:</strong> {jogador.nome}<br />
            <strong>Sexo:</strong> {jogador.sexo}<br />
            <strong>Idade:</strong> {jogador.idade}<br />
            <strong>Altura:</strong> {jogador.altura} cm<br />
            <strong>Peso:</strong> {jogador.peso} kg<br />
            <strong>Posição:</strong> {jogador.posicao}<br />
            <strong>Nº da Camisa:</strong> {jogador.numeroCamisa}
          </li>
        ))
      )}
    </ul>
  );
}

export default ListaDeUsuarios;