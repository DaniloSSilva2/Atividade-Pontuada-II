import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import PaginaInicial from './pages/Inicio/Index';
import PaginaCadastro from './pages/Cadastro';
import PaginaListaUsuarios from './pages/Lista';

import './App.css'; // estilos globais, se usar

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<PaginaInicial />} />
        <Route path="/cadastro" element={<PaginaCadastro />} />
        <Route path="/usuarios" element={<PaginaListaUsuarios />} />
      </Routes>
    </Router>
  );
}

export default App;