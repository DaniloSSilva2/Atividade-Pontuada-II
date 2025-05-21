import React from 'react';
import { Link } from 'react-router-dom';
import './Inicio.css';
import cbf from '../../assets/images/cbf.png';

function PaginaInicial() {
  return (
    <div className="inicio-container">
      <img src={cbf} alt="Logo do Time" className="logo" />
      <h1>Bem-vindo ao Sistema</h1>
      <div className="botoes">
        <Link to="/cadastro" className="botao">Cadastro</Link>
        <Link to="/usuarios" className="botao">Lista de Usuários</Link>
      </div>
    </div>
  );
}

export default PaginaInicial;